package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents one button of the reply keyboard. For simple text
 * buttons String can be used instead of this object to specify text of the
 * button. Optional fields are mutually exclusive.
 * 
 * Note: request_contact and request_location options will only work in Telegram
 * versions released after 9 April, 2016. Older clients will ignore them.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#keyboardbutton">https://core.telegram.org/bots/api#keyboardbutton</a>
 *
 */
public class KeyboardButton {
    /**
     * Text of the button. If none of the optional fields are used, it will be sent
     * as a message when the button is pressed
     */
    @JsonProperty("text")
    private String  text;
    /**
     * Optional. If True, the user's phone number will be sent as a contact when the
     * button is pressed. Available in private chats only
     */
    @JsonProperty("request_contact")
    private Boolean requestContact;
    /**
     * Optional. If True, the user's current location will be sent when the button
     * is pressed. Available in private chats only
     */
    @JsonProperty("request_location")
    private Boolean requestLocation;

    /**
     * @return the requestContact
     */
    public Boolean getRequestContact() {
        return requestContact;
    }

    /**
     * @return the requestLocation
     */
    public Boolean getRequestLocation() {
        return requestLocation;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param requestContact the requestContact to set
     */
    public void setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
    }

    /**
     * @param requestLocation the requestLocation to set
     */
    public void setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
}
