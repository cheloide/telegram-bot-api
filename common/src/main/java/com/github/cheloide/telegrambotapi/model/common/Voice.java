package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a voice note.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#voice">https://core.telegram.org/bots/api#voice</a>
 */
public class Voice {
    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String  fileId;
    /**
     * Duration of the audio in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer duration;
    /**
     * Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String  mimeType;
    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize;

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
     * @return the mimeType
     */
    public String getMimeType() {
        return mimeType;
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
     * @param mimeType the mimeType to set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
