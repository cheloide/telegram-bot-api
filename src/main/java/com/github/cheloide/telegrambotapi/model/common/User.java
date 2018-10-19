package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a Telegram user or bot.
 * 
 * @author Marcelo González
 *
 */
public class User {

    /**
     * Unique identifier for this user or bot
     */
    @JsonProperty("id")
    private long    id;
    /**
     * True, if this user is a bot
     */
    @JsonProperty("is_bot")
    private boolean isBot;
    /**
     * User‘s or bot’s first name
     */
    @JsonProperty("first_name")
    private String  firstName;
    /**
     * Optional. User‘s or bot’s last name
     */
    @JsonProperty("last_name")
    private String  LastName;
    /**
     * Optional. User‘s or bot’s username
     */
    @JsonProperty("username")
    private String  username;
    /**
     * Optional. IETF language tag of the user's language
     */
    @JsonProperty("language_code")
    private String  languageCode;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the languageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the isBot
     */
    public boolean isBot() {
        return isBot;
    }

    /**
     * @param isBot the isBot to set
     */
    public void setBot(boolean isBot) {
        this.isBot = isBot;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @param languageCode the languageCode to set
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

}
