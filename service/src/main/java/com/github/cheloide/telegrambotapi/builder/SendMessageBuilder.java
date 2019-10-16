package com.github.cheloide.telegrambotapi.builder;

import com.github.cheloide.telegrambotapi.domain.SendMessageRequest;
import com.github.cheloide.telegrambotapi.model.common.InlineKeyboardMarkup;

public class SendMessageBuilder {

    private Long chatId;
    private String text;
    private String parseMode;
    private Boolean disableWebPagePreview;
    private Boolean disableNotification;
    private Integer replyToMessageId;
    private InlineKeyboardMarkup replyMarkup;

    private SendMessageBuilder() {

    }

    public static SendMessageBuilder getBuilder() {
        return new SendMessageBuilder();
    }

    /**
     * @param chatId the chatId to set
     */
    public SendMessageBuilder setChatId(Long chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * @param text the text to set
     */
    public SendMessageBuilder setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * @param parseMode the parseMode to set
     */
    public SendMessageBuilder setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * @param disableWebPagePreview the disableWebPagePreview to set
     */
    public SendMessageBuilder setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
        return this;
    }

    /**
     * @param disableNotification the disableNotification to set
     */
    public SendMessageBuilder setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * @param replyToMessageId the replyToMessageId to set
     */
    public SendMessageBuilder setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * @param replyMarkup the replyMarkup to set
     */
    public SendMessageBuilder setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    public SendMessageRequest build() {
        SendMessageRequest sendMessage = new SendMessageRequest();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        sendMessage.setParseMode(parseMode);
        sendMessage.setDisableWebPagePreview(disableWebPagePreview);
        sendMessage.setDisableNotification(disableNotification);
        sendMessage.setReplyToMessageId(replyToMessageId);
        if (replyMarkup != null)
            sendMessage.setReplyMarkup(replyMarkup);
        return sendMessage;
    }

}
