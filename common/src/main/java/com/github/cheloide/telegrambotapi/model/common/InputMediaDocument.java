package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a general file to be sent.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#inputmediadocument">https://core.telegram.org/bots/api#inputmediadocument</a>
 */
public class InputMediaDocument {
    /**
     * Type of the result, must be document
     */
    @JsonProperty("type")
    private String type;
    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram
     * servers (recommended), pass an HTTP URL for Telegram to get a file from the
     * Internet, or pass “attach://<file_attach_name>” to upload a new one using
     * multipart/form-data under <file_attach_name> name. More info on Sending Files
     * »
     */
    @JsonProperty("media")
    private String media;
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
    /**
     * Optional. Caption of the document to be sent, 0-200 characters
     */
    @JsonProperty("caption")
    private String caption;
    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in the media caption.
     */
    @JsonProperty("parse_mode")
    private String parseMode;

    /**
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * @return the media
     */
    public String getMedia() {
        return media;
    }

    /**
     * @return the parseMode
     */
    public String getParseMode() {
        return parseMode;
    }

    /**
     * @return the thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param caption the caption to set
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(String media) {
        this.media = media;
    }

    /**
     * @param parseMode the parseMode to set
     */
    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    /**
     * @param thumb the thumb to set
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
