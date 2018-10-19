package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents an animation file (GIF or H.264/MPEG-4 AVC video
 * without sound).
 * 
 * @author Marcelo González
 *
 */
public class Animation {
    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String    fileId;
    /**
     * Video width as defined by sender
     */
    @JsonProperty("width")
    private Integer   width;
    /**
     * Video height as defined by sender
     */
    @JsonProperty("height")
    private Integer   height;
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
     * Optional. Mime type of a file as defined by sender
     */
    @JsonProperty("mime_type")
    private String    mimeType;
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
     * @return the height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @return the mimeType
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * @return the thumb
     */
    public PhotoSize getThumb() {
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
     * @param height the height to set
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * @param mimeType the mimeType to set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * @param thumb the thumb to set
     */
    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(Integer width) {
        this.width = width;
    }
}
