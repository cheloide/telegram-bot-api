package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a phone contact.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#contact">https://core.telegram.org/bots/api#contact</a>
 */
public class Contact {

    /**
     * Contact's phone number
     */
    @JsonProperty("phone_number")
    private String  phoneNumber;
    /**
     * Contact's first name
     */
    @JsonProperty("first_name")
    private String  firstName;
    /**
     * Optional. Contact's last name
     */
    @JsonProperty("last_name")
    private String  lastName;
    /**
     * Optional. Contact's user identifier in Telegram
     */
    @JsonProperty("user_id")
    private Integer userId;
    /**
     * Optional. Additional data about the contact in the form of a vCard
     */
    @JsonProperty("vcard")
    private String  vcard;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @return the vcard
     */
    public String getVcard() {
        return vcard;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @param vcard the vcard to set
     */
    public void setVcard(String vcard) {
        this.vcard = vcard;
    }
}
