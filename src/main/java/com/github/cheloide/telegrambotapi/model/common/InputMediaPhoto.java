package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a photo to be sent.
 * 
 * @author Marcelo González
 *
 */
public class InputMediaPhoto {
    /**
     * Type of the result, must be photo
     */
    @JsonProperty("type")
    private String type;
    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram
     * servers (recommended), pass an HTTP URL for Telegram to get a file from the
     * Internet, or pass “attach://<file_attach_name>” to upload a new one using
     * multipart/form-data under <file_attach_name> name.
     * <a href="https://core.telegram.org/bots/api#sending-files">More info on
     * Sending Files</a> »
     */
    @JsonProperty("media")
    private String media;
    /**
     * Optional. Caption of the photo to be sent, 0-200 characters
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
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
