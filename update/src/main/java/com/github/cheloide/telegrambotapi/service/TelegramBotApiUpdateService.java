package com.github.cheloide.telegrambotapi.service;

import com.github.cheloide.telegrambotapi.model.common.Update;

public interface TelegramBotApiUpdateService {

    public void startUpdates();

    public void stopUpdates();

    public void flushUpdates();

    public Update poll();
}
