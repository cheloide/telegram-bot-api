package com.github.cheloide.telegrambotapi.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a custom keyboard with reply options (see Introduction
 * to bots for details and examples).
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardmarkup">https://core.telegram.org/bots/api#replykeyboardmarkup</a>
 */
public class ReplyKeyboardMarkup {
    /**
     * Array of button rows, each represented by an Array of KeyboardButton objects
     */
    @JsonProperty("keyboard")
    private List<List<KeyboardButton>> keyboard;
    /**
     * Optional. Requests clients to resize the keyboard vertically for optimal fit
     * (e.g., make the keyboard smaller if there are just two rows of buttons).
     * Defaults to false, in which case the custom keyboard is always of the same
     * height as the app's standard keyboard.
     */
    @JsonProperty("resize_keyboard")
    private Boolean                    resizeKeyboard;
    /**
     * Optional. Requests clients to hide the keyboard as soon as it's been used.
     * The keyboard will still be available, but clients will automatically display
     * the usual letter-keyboard in the chat – the user can press a special button
     * in the input field to see the custom keyboard again. Defaults to false.
     */
    @JsonProperty("one_time_keyboard")
    private Boolean                    oneTimeKeyboard;
    /**
     * Optional. Use this parameter if you want to show the keyboard to specific
     * users only. Targets: 1) users that are @mentioned in the text of the Message
     * object; 2) if the bot's message is a reply (has reply_to_message_id), sender
     * of the original message. Example: A user requests to change the bot‘s
     * language, bot replies to the request with a keyboard to select the new
     * language. Other users in the group don’t see the keyboard. Example: A user
     * requests to change the bot‘s language, bot replies to the request with a
     * keyboard to select the new language. Other users in the group don’t see the
     * keyboard.
     */
    @JsonProperty("selective")
    private Boolean                    selective;

    /**
     * @return the keyboard
     */
    public List<List<KeyboardButton>> getKeyboard() {
        return keyboard;
    }

    /**
     * @return the oneTimeKeyboard
     */
    public Boolean getOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    /**
     * @return the resizeKeyboard
     */
    public Boolean getResizeKeyboard() {
        return resizeKeyboard;
    }

    /**
     * @return the selective
     */
    public Boolean getSelective() {
        return selective;
    }

    /**
     * @param keyboard the keyboard to set
     */
    public void setKeyboard(List<List<KeyboardButton>> keyboard) {
        this.keyboard = keyboard;
    }

    /**
     * @param oneTimeKeyboard the oneTimeKeyboard to set
     */
    public void setOneTimeKeyboard(Boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
    }

    /**
     * @param resizeKeyboard the resizeKeyboard to set
     */
    public void setResizeKeyboard(Boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
    }

    /**
     * @param selective the selective to set
     */
    public void setSelective(Boolean selective) {
        this.selective = selective;
    }

}
