package com.github.cheloide.telegrambotapi.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.cheloide.telegrambotapi.exception.TelegramBotApiClientException;
import com.github.cheloide.telegrambotapi.exception.TelegramBotApiServerException;
import com.github.cheloide.telegrambotapi.exception.TelegramBotApiTimeoutException;
import com.github.cheloide.telegrambotapi.service.TelegramHttpRequestService;

public class TelegramHttpRequestServiceImpl implements TelegramHttpRequestService {

    private static final Logger LOGGER = LoggerFactory.getLogger("TelegramHttpRequestServiceImpl");
    private String              botApiURL;
    private int                 timeout;
    private String              tokenizedURL;

    private TelegramHttpRequestServiceImpl() {
        this.botApiURL = "https://api.telegram.org/bot<token>/%s";
        this.tokenizedURL = "https://api.telegram.org/bot<token>/%s";
        this.timeout = 60000;
    }

    public TelegramHttpRequestServiceImpl(String botToken) {
        this();
        this.botApiURL = botApiURL.replace("<token>", botToken);
        this.tokenizedURL = botApiURL.replace("<token>", StringUtils.repeat("X", botToken.length()));

        if (LOGGER.isTraceEnabled())
            LOGGER.trace("BotApiURL: {}", botApiURL);
        else if (LOGGER.isDebugEnabled())
            LOGGER.debug("BotApiURL: {}", tokenizedURL);

    }

    public TelegramHttpRequestServiceImpl(String botToken, int timeout) {
        this(botToken);
        this.timeout = timeout;
    }

    public String get(String method) throws TelegramBotApiClientException, TelegramBotApiServerException, TelegramBotApiTimeoutException {
        return get(method, new HashMap<String, String>());
    }

    public String get(String method, Map<String, String> queryParams) throws TelegramBotApiClientException, TelegramBotApiServerException, TelegramBotApiTimeoutException {

        if (method == null || queryParams == null)
            throw new NullPointerException();
        else if (method.isEmpty())
            throw new TelegramBotApiClientException("Parameter \"method\" should not be empty.");

        int               responseCode = 0;
        HttpURLConnection conn         = null;
        String            response     = null;

        String urlString = String.format(botApiURL, method);
        urlString += queryBuilder(queryParams);

        try {

            conn = (HttpURLConnection) new URL(urlString).openConnection();

            conn.setConnectTimeout(timeout);
            conn.setRequestMethod("GET");
            conn.setDoOutput(true);

            conn.connect();

            responseCode = conn.getResponseCode();

            response = parseHttpResponse(new InputStreamReader(conn.getInputStream()));
            LOGGER.trace("URL: {}, status: {}", urlString, responseCode);

            if (responseCode >= 200 && responseCode < 300) {
                LOGGER.debug("Response: {}", response);
            } else if (responseCode >= 400 && responseCode < 500) {
                throw new TelegramBotApiClientException(String.format("Client Error, Server returned code %d", responseCode));
            } else if (responseCode >= 500 && responseCode < 600) {
                throw new TelegramBotApiServerException(String.format("Server Error, Server returned code %d", responseCode));
            }

        } catch (MalformedURLException e) {
            LOGGER.debug("Error parsing URL", e);
        } catch (IOException e) {
            LOGGER.debug("Error reading/writing", e);
        }
        return response;

    }

    public String postJson(String method, String body) throws TelegramBotApiClientException, TelegramBotApiServerException, TelegramBotApiTimeoutException {

        if (StringUtils.isBlank(method) && StringUtils.isBlank(body))
            throw new TelegramBotApiClientException("Parameters \"method\" and \"body\" should not be empty or null.");
        else if (StringUtils.isBlank(method))
            throw new TelegramBotApiClientException("Parameter \"method\" should not be empty or null.");
        else if (StringUtils.isBlank(body))
            throw new TelegramBotApiClientException("Parameter \"body\" should not be empty or null.");

        String            urlString    = String.format(botApiURL, method);
        int               responseCode = 0;
        HttpURLConnection conn         = null;
        String            response     = null;
        OutputStream      os           = null;

        try {

            conn = (HttpURLConnection) new URL(urlString).openConnection();

            conn.setConnectTimeout(timeout);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            os = conn.getOutputStream();
            os.write(body.getBytes());

            conn.connect();

            responseCode = conn.getResponseCode();
            LOGGER.debug("Response code: {}", responseCode);

            LOGGER.trace("URL:{}, Payload: {}, status:{}", urlString, body, responseCode);

            if (responseCode >= 200 && responseCode < 300) {
                response = parseHttpResponse(new InputStreamReader(conn.getInputStream()));
                LOGGER.debug("Response: {}", response);
            } else if (responseCode >= 400 ) {
                response = parseHttpResponse(new InputStreamReader(conn.getErrorStream()));
                throw new TelegramBotApiClientException(String.format("Client Error, Server returned code %d, (%s)", responseCode, response));
            }

        } catch (MalformedURLException e) {
            LOGGER.debug("Error parsing URL", e);
        } catch (IOException e) {
            LOGGER.debug("Error reading/writing", e);
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    LOGGER.debug("OutputStream \"os\", didn't close properly.", e);
                }
            }
        }
        return response;
    }

    public String postMultipart(String method, String body) throws TelegramBotApiClientException, TelegramBotApiServerException, TelegramBotApiTimeoutException {
        // TODO Auto-generated method stub
        return null;
    }

    private String parseHttpResponse(InputStreamReader is) throws IOException {
        BufferedReader reader = new BufferedReader(is);
        StringBuilder  sb     = new StringBuilder();
        String         line;

        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        reader.close();
        return sb.toString();
    }

    private String queryBuilder(Map<String, String> queryParams) {
        StringBuilder sb = new StringBuilder();
        for (Entry<String, String> entry : queryParams.entrySet()) {
            StringBuilder sbAux = new StringBuilder();
            try {
                sbAux.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sbAux.append("=");
                sbAux.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                continue;
            }
            if (sb.length() > 0)
                sb.append('&');
            sb.append(sbAux.toString());
        }
        if (sb.length() > 0)
            sb.insert(0, '?');
        return sb.toString();
    }

}
