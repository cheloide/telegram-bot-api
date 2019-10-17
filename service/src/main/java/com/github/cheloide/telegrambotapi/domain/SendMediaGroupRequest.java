package com.github.cheloide.telegrambotapi.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.cheloide.telegrambotapi.model.common.InputMedia;
import com.github.cheloide.telegrambotapi.model.common.InputMediaPhoto;

public class SendMediaGroupRequest {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * 
     */
    @JsonProperty("chat_id")
    private String                chatId;
    /**
     * A JSON-serialized array describing photos and videos to be sent, must include 2–10 items
     */
    @JsonProperty("media")
    private List<InputMedia> media;
    /**
     * Sends the messages silently. Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean               disableNotification;
    /**
     * If the messages are a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    private Long                  replyToMessageId;

    /**
     * @return the chatId
     */
    public String getChatId() {
        return chatId;
    }

    /**
     * @param chatId the chatId to set
     */
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = String.valueOf(chatId);
    }

    /**
     * @return the media
     */
    public List<InputMedia> getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(List<InputMedia> media) {
        this.media = media;
    }

    /**
     * @return the disableNotification
     */
    public Boolean getDisableNotification() {
        return disableNotification;
    }

    /**
     * @param disableNotification the disableNotification to set
     */
    public void setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
    }

    /**
     * @return the replyToMessageId
     */
    public Long getReplyToMessageId() {
        return replyToMessageId;
    }

    /**
     * @param replyToMessageId the replyToMessageId to set
     */
    public void setReplyToMessageId(Long replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

}
