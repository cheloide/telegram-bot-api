package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a general file (as opposed to photos, voice messages
 * and audio files).
 * 
 * @author Marcelo González
 *
 */
public class Document {

    /**
     * Unique file identifier
     */
    @JsonProperty("file_id")
    private String    fileId;
    /**
     * Optional. Document thumbnail as defined by sender
     */
    @JsonProperty("thumb")
    private PhotoSize thumb;
    /**
     * Optional. Original filename as defined by sender
     */
    @JsonProperty("file_name")
    private String    fileName;
    /**
     * Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String    mimeType;
    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer   fileSize;

    /**
     * @return the fileId
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @return the fileSize
     */
    public Integer getFileSize() {
        return fileSize;
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
     * @param fileId the fileId to set
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @param fileSize the fileSize to set
     */
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
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
}
