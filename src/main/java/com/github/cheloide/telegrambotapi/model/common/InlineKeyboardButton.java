package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.cheloide.telegrambotapi.model.game.CallbackGame;

/**
 * This object represents one button of an inline keyboard. You must use exactly
 * one of the optional fields.
 * 
 * @author Marcelo González
 *
 */
public class InlineKeyboardButton {
    /**
     * Label text on the button
     */
    @JsonProperty("text")
    private String text;
    /**
     * Optional. HTTP or tg:// url to be opened when button is pressed
     */
    @JsonProperty("url")
    private String url;
    /**
     * Optional. Data to be sent in a callback query to the bot when button is
     * pressed, 1-64 bytes
     */
    @JsonProperty("callback_data")
    private String callbackData;
    /**
     * Optional. If set, pressing the button will prompt the user to select one of
     * their chats, open that chat and insert the bot‘s username and the specified
     * inline query in the input field. Can be empty, in which case just the bot’s
     * username will be inserted. Note: This offers an easy way for users to start
     * using your bot in inline mode when they are currently in a private chat with
     * it. Especially useful when combined with switch_pm… actions – in this case
     * the user will be automatically returned to the chat they switched from,
     * skipping the chat selection screen.
     */
    @JsonProperty("switch_inline_query")
    private String switchInlineQuery;

    /**
     * Optional. If set, pressing the button will insert the bot‘s username and the
     * specified inline query in the current chat's input field. Can be empty, in
     * which case only the bot’s username will be inserted.
     */
    @JsonProperty("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;

    /**
     * Optional. Description of the game that will be launched when the user presses
     * the button. NOTE: This type of button must always be the first button in the
     * first row.
     */
    @JsonProperty("callback_game")
    private CallbackGame callbackGame;

    /**
     * Optional. Specify True, to send a Pay button. NOTE: This type of button must
     * always be the first button in the first row.
     */
    @JsonProperty("pay")
    private Boolean pay;

    /**
     * @return the callbackData
     */
    public String getCallbackData() {
        return callbackData;
    }

    /**
     * @return the callbackGame
     */
    public CallbackGame getCallbackGame() {
        return callbackGame;
    }

    /**
     * @return the pay
     */
    public Boolean getPay() {
        return pay;
    }

    /**
     * @return the switchInlineQuery
     */
    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    /**
     * @return the switchInlineQueryCurrentChat
     */
    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param callbackData the callbackData to set
     */
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * @param callbackGame the callbackGame to set
     */
    public void setCallbackGame(CallbackGame callbackGame) {
        this.callbackGame = callbackGame;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    /**
     * @param switchInlineQuery the switchInlineQuery to set
     */
    public void setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
    }

    /**
     * @param switchInlineQueryCurrentChat the switchInlineQueryCurrentChat to set
     */
    public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
