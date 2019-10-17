package com.github.cheloide.telegrambotapi.model.common;

/**
 * Represents a photo to be sent.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#inputmediaphoto">https://core.telegram.org/bots/api#inputmediaphoto</a>
 */
public class InputMediaPhoto extends InputMedia {
    public InputMediaPhoto() {
        super(InputMedia.PHOTO);
    }

}
