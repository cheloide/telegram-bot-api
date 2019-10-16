package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents one special entity in a text message. For example,
 * hashtags, usernames, URLs, etc.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#messageentity">https://core.telegram.org/bots/api#messageentity</a>
 *
 */
public class MessageEntity {
    /**
     * Type of the entity. Can be mention (@username), hashtag, cashtag,
     * bot_command, url, email, phone_number, bold (bold text), italic (italic
     * text), code (monowidth string), pre (monowidth block), text_link (for
     * clickale text URLs), text_mention (for users without usernames)
     * 
     */
    @JsonProperty("type")
    private String  type;
    /**
     * Offset in UTF-16 code units to the start of the entity
     */
    @JsonProperty("offset")
    private Integer offset;
    /**
     * Length of the entity in UTF-16 code units
     */
    @JsonProperty("length")
    private Integer length;
    /**
     * Optional. For “text_link” only, url that will be opened after user taps on
     * the text
     */
    @JsonProperty("url")
    private String  url;
    /**
     * Optional. For “text_mention” only, the mentioned user
     */
    @JsonProperty("user")
    private User    user;

    /**
     * @return the length
     */
    public Integer getLength() {
        return length;
    }

    /**
     * @return the offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param length the length to set
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * @param offset the offset to set
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
}
