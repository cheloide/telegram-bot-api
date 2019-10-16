package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a parameter of the inline keyboard button used to automatically authorize a user. Serves as a great replacement for the Telegram Login Widget when the user is coming from Telegram. All the user needs to do is tap/click a button and confirm that they want to log in:
 * <br>
 * <img width="200px" src="https://core.telegram.org/file/811140015/1734/8VZFkwWXalM.97872/6127fa62d8a0bf2b3c">
 * <br>
 * Telegram apps support these buttons as of version 5.7.
 * 
 * <blockquote>
 * Sample bot <a href="https://t.me/discussbot">@discussbot</a>
 * </blockquote>
 * 
 * @author marcelo
 * @see <a href="https://core.telegram.org/bots/api#loginurl">https://core.telegram.org/bots/api#loginurl</a>
 */
public class LoginUrl {
    /**
     * An HTTP URL to be opened with user authorization data added to the query string when the button is pressed. If the user refuses to provide authorization data, the original URL without information about the user will be opened. The data added is the same as described in Receiving authorization data.
     * 
     * <b>NOTE:</b> You must always check the hash of the received data to verify the authentication and the integrity of the data as described in Checking authorization.
     */
    @JsonProperty("url")
    private String  url;
    /**
     * Optional. New text of the button in forwarded messages.
     */
    @JsonProperty("forward_text")
    private String  fordwardText;
    /**
     * Optional. Username of a bot, which will be used for user authorization. See Setting up a bot for more details. If not specified, the current bot's username will be assumed. The url's domain must be the same as the domain linked with the bot. See Linking your domain to the bot for more details.
     */
    @JsonProperty("bot_username")
    private String  botUsername;
    /**
     * Optional. Pass True to request the permission for your bot to send messages to the user.
     */
    @JsonProperty("request_write_access")
    private Boolean requestWriteAccess;

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the fordwardText
     */
    public String getFordwardText() {
        return fordwardText;
    }

    /**
     * @param fordwardText the fordwardText to set
     */
    public void setFordwardText(String fordwardText) {
        this.fordwardText = fordwardText;
    }

    /**
     * @return the botUsername
     */
    public String getBotUsername() {
        return botUsername;
    }

    /**
     * @param botUsername the botUsername to set
     */
    public void setBotUsername(String botUsername) {
        this.botUsername = botUsername;
    }

    /**
     * @return the requestWriteAccess
     */
    public Boolean getRequestWriteAccess() {
        return requestWriteAccess;
    }

    /**
     * @param requestWriteAccess the requestWriteAccess to set
     */
    public void setRequestWriteAccess(Boolean requestWriteAccess) {
        this.requestWriteAccess = requestWriteAccess;
    }

}
