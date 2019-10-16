package com.github.cheloide.telegrambotapi.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.cheloide.telegrambotapi.model.common.InlineKeyboardMarkup;

public class SendMessageRequest {
    /**
     * or String Yes Unique identifier for the target chat or username of the target
     * channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private long chatId;

    /**
     * Yes Text of the message to be sent
     */
    @JsonProperty("text")
    @Valid
    @NotBlank
    private String text;

    /**
     * Optional Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in your bot's message.
     */
    @JsonProperty("parse_mode")
    @Valid
    @Pattern(regexp = "Markdown|HTML")
    private String parseMode;

    /**
     * Optional Disables link previews for links in this message
     */
    @JsonProperty("disable_web_page_preview")
    private Boolean disableWebPagePreview;

    /**
     * Optional Sends the message silently. Users will receive a notification with
     * no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification;

    /**
     * Optional If the message is a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    private Integer replyToMessageId;

    /**
     * or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional
     * Additional interface options. A JSON-serialized object for an inline
     * keyboard, custom reply keyboard, instructions to remove reply keyboard or to
     * force a reply from the user.
     */
    @JsonProperty("reply_markup")
    @Valid
    private InlineKeyboardMarkup replyMarkup;

    /**
     * @return the chatId
     */
    public long getChatId() {
        return chatId;
    }

    /**
     * @return the disableNotification
     */
    public Boolean getDisableNotification() {
        return disableNotification;
    }

    /**
     * @return the disableWebPagePreview
     */
    public Boolean getDisableWebPagePreview() {
        return disableWebPagePreview;
    }

    /**
     * @return the parseMode
     */
    public String getParseMode() {
        return parseMode;
    }

    /**
     * @return the replyMarkup
     */
    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    /**
     * @return the replyToMessageId
     */
    public Integer getReplyToMessageId() {
        return replyToMessageId;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param chatId the chatId to set
     */
    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    /**
     * @param disableNotification the disableNotification to set
     */
    public void setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
    }

    /**
     * @param disableWebPagePreview the disableWebPagePreview to set
     */
    public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
    }

    /**
     * @param parseMode the parseMode to set
     */
    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    /**
     * @param replyMarkup the replyMarkup to set
     */
    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    /**
     * @param replyToMessageId the replyToMessageId to set
     */
    public void setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

}
