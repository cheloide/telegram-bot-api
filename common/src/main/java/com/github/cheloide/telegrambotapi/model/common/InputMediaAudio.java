package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an audio file to be treated as music to be sent.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#inputmediaaudio">https://core.telegram.org/bots/api#inputmediaaudio</a>
 */
public class InputMediaAudio extends InputMedia {

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
    private String  thumb;
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

    public InputMediaAudio() {
        super(InputMedia.AUDIO);
    }

    /**
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
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
     * @param duration the duration to set
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
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
}
