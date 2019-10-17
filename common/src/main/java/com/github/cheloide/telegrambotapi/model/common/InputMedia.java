package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents the content of a media message to be sent. It should
 * be one of
 * <ul>
 * <li>InputMediaAnimation</li>
 * <li>InputMediaDocument</li>
 * <li>InputMediaAudio</li>
 * <li>InputMediaPhoto</li>
 * <li>InputMediaVideo</li>
 * </ul>
 * 
 *
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#inputmedia">https://core.telegram.org/bots/api#inputmedia</a>
 */
public class InputMedia {
    public static String PHOTO     = "photo";
    public static String VIDEO     = "video";
    public static String ANIMATION = "animation";
    public static String AUDIO     = "audio";
    public static String DOCUMENT  = "document";

    protected InputMedia(String type) {
        this.type = type;
    }

    /**
     * Type of the result, must be photo,
     */
    @JsonProperty("type")
    protected String type;
    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram
     * servers (recommended), pass an HTTP URL for Telegram to get a file from the
     * Internet, or pass “attach://<file_attach_name>” to upload a new one using
     * multipart/form-data under <file_attach_name> name.
     * <a href="https://core.telegram.org/bots/api#sending-files">More info on
     * Sending Files</a> »
     */
    @JsonProperty("media")
    protected String media;
    /**
     * Optional. Caption of the photo to be sent, 0-200 characters
     */
    @JsonProperty("caption")
    protected String caption;
    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in the media caption.
     */
    @JsonProperty("parse_mode")
    protected String parseMode;

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the media
     */
    public String getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(String media) {
        this.media = media;
    }

    /**
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * @param caption the caption to set
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * @return the parseMode
     */
    public String getParseMode() {
        return parseMode;
    }

    /**
     * @param parseMode the parseMode to set
     */
    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

}
