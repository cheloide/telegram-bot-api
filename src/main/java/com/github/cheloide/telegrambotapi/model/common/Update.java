package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.cheloide.telegrambotapi.model.inline.ChosenInlineResult;
import com.github.cheloide.telegrambotapi.model.inline.InlineQuery;
import com.github.cheloide.telegrambotapi.model.payment.PreCheckoutQuery;
import com.github.cheloide.telegrambotapi.model.payment.ShippingQuery;

public class Update {

    @JsonProperty("update_id")
    private int                updateId;
    @JsonProperty("message")
    private Message            message;
    @JsonProperty("edited_message")
    private Message            editedMessage;
    @JsonProperty("channel_post")
    private Message            channelPost;
    @JsonProperty("edited_channel_post")
    private Message            editedChannelPost;
    @JsonProperty("inline_query")
    private InlineQuery        inlineQuery;
    @JsonProperty("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult;
    @JsonProperty("callback_query")
    private CallbackQuery      callbackQuery;
    @JsonProperty("shipping_query")
    private ShippingQuery      shippingQuery;
    @JsonProperty("")
    private PreCheckoutQuery   preCheckoutQuery;

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public Message getMessage() {
        return message;
    }

    public PreCheckoutQuery getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    public int getUpdateId() {
        return updateId;
    }

    public void setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }

    public void setChannelPost(Message channelPost) {
        this.channelPost = channelPost;
    }

    public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
        this.chosenInlineResult = chosenInlineResult;
    }

    public void setEditedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
    }

    public void setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
    }

    public void setInlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
        this.preCheckoutQuery = preCheckoutQuery;
    }

    public void setShippingQuery(ShippingQuery shippingQuery) {
        this.shippingQuery = shippingQuery;
    }

    public void setUpdateId(int updateId) {
        this.updateId = updateId;
    }

}
