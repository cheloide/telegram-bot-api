package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an animation file (GIF or H.264/MPEG-4 AVC video without sound) to
 * be sent.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#inputmediaanimation">https://core.telegram.org/bots/api#inputmediaanimation</a>
 */
public class InputMediaAnimation extends InputMedia {

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
     * Optional. Animation width
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * Optional. Animation height
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * Optional. Animation duration
     */
    @JsonProperty("duration")
    private Integer duration;

    public InputMediaAnimation() {
        super(InputMedia.ANIMATION);
    }

    /**
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * @return the height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @return the thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * @return the width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * @param thumb the thumb to set
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(Integer width) {
        this.width = width;
    }
}
