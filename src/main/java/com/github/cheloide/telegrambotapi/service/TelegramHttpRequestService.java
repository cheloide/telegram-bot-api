package com.github.cheloide.telegrambotapi.service;

import com.github.cheloide.telegrambotapi.exception.TelegramBotApiClientException;
import com.github.cheloide.telegrambotapi.exception.TelegramBotApiServerException;
import com.github.cheloide.telegrambotapi.exception.TelegramBotApiTimeoutException;

public interface TelegramHttpRequestService {

    public String get(String method, String query) throws TelegramBotApiClientException, TelegramBotApiServerException, TelegramBotApiTimeoutException;

    public String postJson(String method, String body) throws TelegramBotApiClientException, TelegramBotApiServerException, TelegramBotApiTimeoutException;
    
    public String postMultipart(String method, String body) throws TelegramBotApiClientException, TelegramBotApiServerException, TelegramBotApiTimeoutException;
}
