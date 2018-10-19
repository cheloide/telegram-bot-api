package com.github.cheloide.telegrambotapi.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.lang3.StringUtils;

import com.github.cheloide.telegrambotapi.exception.TelegramBotApiClientException;
import com.github.cheloide.telegrambotapi.exception.TelegramBotApiServerException;
import com.github.cheloide.telegrambotapi.exception.TelegramBotApiTimeoutException;
import com.github.cheloide.telegrambotapi.service.TelegramHttpRequestService;

public class TelegramHttpRequestServiceImpl implements TelegramHttpRequestService {

    private String botApiURL;
    private int    timeout;
    private String tokenizedURL;

    private TelegramHttpRequestServiceImpl() {
        this.botApiURL = "https://api.telegram.org/bot<token>/";
        this.tokenizedURL = "https://api.telegram.org/bot<token>/";
        this.timeout = 10000;
    }

    public TelegramHttpRequestServiceImpl(String botToken) {
        this();
        this.botApiURL = botApiURL.replace("<token>", botToken);
        this.tokenizedURL = botApiURL.replace("<token>", StringUtils.repeat("X", botToken.length()));
    }

    public TelegramHttpRequestServiceImpl(String botToken, int timeout) {
        this(botToken);
        this.timeout = timeout;
    }

    public String get(String method, String query) throws TelegramBotApiClientException, TelegramBotApiServerException, TelegramBotApiTimeoutException {
        // TODO
        return null;
    }

    public String postJson(String method, String body) throws TelegramBotApiClientException, TelegramBotApiServerException, TelegramBotApiTimeoutException {

        if (method == null || body == null)
            throw new NullPointerException();
        else if (method.isEmpty()&& body.isEmpty())
            throw new TelegramBotApiClientException("Parameters \"method\" and \"body\" should not be empty.");
        else if (method.isEmpty())
            throw new TelegramBotApiClientException("Parameter \"method\" should not be empty.");
        else if (body.isEmpty())
            throw new TelegramBotApiClientException("Parameter \"body\" should not be empty.");
        
        // TODO GOOD CODE

        int               responseCode;
        HttpURLConnection conn      = null;
        String            response  = null;
        String            urlString = botApiURL.replaceAll("METHOD_NAME", method);

        try {

            conn = (HttpURLConnection) new URL(urlString).openConnection();

            conn.setConnectTimeout(timeout);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            OutputStream os = conn.getOutputStream();
            os.write(body.getBytes());

            conn.connect();

            responseCode = conn.getResponseCode();

            if (responseCode >= 200 && responseCode < 300) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder  sb     = new StringBuilder();
                String         line;

                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }

                response = sb.toString();

            } else if (responseCode >= 400 && responseCode < 500) {
                throw new TelegramBotApiClientException(String.format("4xx Client Error, Server returned code %d", responseCode));
            } else if (responseCode >= 500 && responseCode < 600) {
                throw new TelegramBotApiServerException(String.format("5xx Server Error, Server returned code %d", responseCode));

            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.getOutputStream().close();
                    conn.getInputStream().close();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
        return response;
    }

    public String postMultipart(String method, String body) throws TelegramBotApiClientException, TelegramBotApiServerException, TelegramBotApiTimeoutException {
        // TODO Auto-generated method stub
        return null;
    }
    
    private String parseHttpResponse(InputStreamReader is) {
        BufferedReader reader = new BufferedReader(is);
        StringBuilder  sb     = new StringBuilder();
        String         line;

        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            return "";
        }

        return sb.toString();
    }

}
