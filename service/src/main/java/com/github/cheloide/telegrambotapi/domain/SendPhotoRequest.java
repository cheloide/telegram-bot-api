package com.github.cheloide.telegrambotapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.cheloide.telegrambotapi.model.common.InlineKeyboardMarkup;

public class SendPhotoRequest {

    @JsonProperty("chat_id")
    private String               chatId;
    @JsonProperty("photo")
    private String               photo;
    @JsonProperty("caption")
    private String               caption;
    @JsonProperty("parse_mode")
    private String               parseMode;
    @JsonProperty("disable_notification")
    private Boolean              disableNotification;
    @JsonProperty("reply_to_message_id")
    private Integer              replyToMessageId;
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = String.valueOf(chatId);
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getParseMode() {
        return parseMode;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public void setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
    }

    public Integer getReplyToMessageId() {
        return replyToMessageId;
    }

    public void setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

}
