package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a general file to be sent.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#inputmediadocument">https://core.telegram.org/bots/api#inputmediadocument</a>
 */
public class InputMediaDocument extends InputMedia {
    /**
     * or String Optional. Thumbnail of the file sent. The thumbnail should be in
     * JPEG format and less than 200 kB in size. A thumbnail‘s width and height
     * should not exceed 90. Ignored if the file is not uploaded using
     * multipart/form-data. Thumbnails can’t be reused and can be only uploaded as a
     * new file, so you can pass “attach://<file_attach_name>” if the thumbnail was
     * uploaded using multipart/form-data under <file_attach_name>. More info on
     * Sending Files »
     */
    @JsonProperty("thumb")
    private String thumb;

    public InputMediaDocument() {
        super(InputMedia.DOCUMENT);
    }

    /**
     * @return the thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * @param thumb the thumb to set
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

}
