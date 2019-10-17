package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a video to be sent.
 * 
 * @author Marcelo González
 *
 */
public class InputMediaVideo extends InputMedia {
    /**
     * Optional. Thumbnail of the file sent. The thumbnail should be in JPEG format
     * and less than 200 kB in size. A thumbnail‘s width and height should not
     * exceed 90. Ignored if the file is not uploaded using multipart/form-data.
     * Thumbnails can’t be reused and can be only uploaded as a new file, so you can
     * pass “attach://<file_attach_name>” if the thumbnail was uploaded using
     * multipart/form-data under <file_attach_name>. More info on Sending Files »
     */
    @JsonProperty("thumb")
    private String  thumb;
    /**
     * Optional. Video width
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * Optional. Video height
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * Optional. Video duration
     */
    @JsonProperty("duration")
    private Integer duration;
    /**
     * Optional. Pass True, if the uploaded video is suitable for streaming
     */
    @JsonProperty("supports_streaming")
    private Boolean supportsStreaming;

    public InputMediaVideo() {
        super(InputMedia.VIDEO);
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
     * @return the supportsStreaming
     */
    public Boolean getSupportsStreaming() {
        return supportsStreaming;
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
     * @param supportsStreaming the supportsStreaming to set
     */
    public void setSupportsStreaming(Boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
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
