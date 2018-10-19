package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a video message (available in Telegram apps as of
 * v.4.0).
 * 
 * @author Marcelo González
 *
 */
public class VideoNote {

    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String    fileId;
    /**
     * Video width and height as defined by sender
     */
    @JsonProperty("length")
    private Integer   length;
    /**
     * Duration of the video in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer   duration;
    /**
     * Optional. Video thumbnail
     */
    @JsonProperty("thumb")
    private PhotoSize thumb;
    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer   fileSize;

    /**
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * @return the fileId
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * @return the fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * @return the length
     */
    public Integer getLength() {
        return length;
    }

    /**
     * @return the thumb
     */
    public PhotoSize getThumb() {
        return thumb;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * @param fileId the fileId to set
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * @param fileSize the fileSize to set
     */
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * @param length the length to set
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * @param thumb the thumb to set
     */
    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }
}
