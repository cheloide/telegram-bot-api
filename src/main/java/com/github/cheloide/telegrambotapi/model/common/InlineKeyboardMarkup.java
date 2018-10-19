package com.github.cheloide.telegrambotapi.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents an inline keyboard that appears right next to the
 * message it belongs to.
 * 
 * @author Marcelo González
 *
 */
public class InlineKeyboardMarkup {
    /**
     * Array of button rows, each represented by an Array of InlineKeyboardButton
     * objects
     */
    @JsonProperty("inline_keyboard")
    private List<List<InlineKeyboardButton>> inlineKeyboard;

    /**
     * @return the inlineKeyboard
     */
    public List<List<InlineKeyboardButton>> getInlineKeyboard() {
        return inlineKeyboard;
    }

    /**
     * @param inlineKeyboard the inlineKeyboard to set
     */
    public void setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }
}
