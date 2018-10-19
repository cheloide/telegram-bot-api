package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an audio file to be treated as music to be sent.
 * 
 * @author Marcelo González
 *
 */
public class InputMediaAudio {

    /**
     * Type of the result, must be audio
     */
    @JsonProperty("type")
    private String  type;
    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram
     * servers (recommended), pass an HTTP URL for Telegram to get a file from the
     * Internet, or pass “attach://<file_attach_name>” to upload a new one using
     * multipart/form-data under <file_attach_name> name. More info on Sending Files
     * »
     */
    @JsonProperty("media")
    private String  media;
    /**
     * or String Optional. Thumbnail of the file sent. The thumbnail should be in
     * JPEG format and less than 200 kB in size. A thumbnail‘s width and height
     * should not exceed 90. Ignored if the file is not uploaded using
     * multipart/form-data. Thumbnails can’t be reused and can be only uploaded as a
     * new file, so you can pass “attach://<file_attach_name>” if the thumbnail was
     * uploaded using multipart/form-data under <file_attach_name>. More info on
     * Sending Files »
     */
    @JsonProperty("thumb") // private InputFile thumb;

    private String  thumb;
    /**
     * Optional. Caption of the audio to be sent, 0-200 characters
     */
    @JsonProperty("caption")
    private String  caption;
    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in the media caption.
     */
    @JsonProperty("parse_mode")
    private String  parseMode;
    /**
     * Optional. Duration of the audio in seconds
     */
    @JsonProperty("duration")
    private Integer duration;
    /**
     * Optional. Performer of the audio
     */
    @JsonProperty("performer")
    private String  performer;
    /**
     * Optional. Title of the audio
     */
    @JsonProperty("title")
    private String  title;

    /**
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
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
     * @return the performer
     */
    public String getPerformer() {
        return performer;
    }

    /**
     * @return the thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
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
     * @param duration the duration to set
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
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
     * @param performer the performer to set
     */
    public void setPerformer(String performer) {
        this.performer = performer;
    }

    /**
     * @param thumb the thumb to set
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
