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
    private boolean bot;
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

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

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
