package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents one size of a photo or a file / sticker thumbnail.
 * 
 * @author Marcelo González
 *
 */
public class PhotoSize {
    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String  fileId;
    /**
     * Photo width
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * Photo height
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize;

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
     * @return the width
     */
    public Integer getWidth() {
        return width;
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
     * @param width the width to set
     */
    public void setWidth(Integer width) {
        this.width = width;
    }
}
