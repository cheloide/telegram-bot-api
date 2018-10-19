package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a file ready to be downloaded. The file can be
 * downloaded via the link https://api.telegram.org/file/bot<token>/<file_path>.
 * It is guaranteed that the link will be valid for at least 1 hour. When the
 * link expires, a new one can be requested by calling getFile.
 * 
 * @author Marcelo González
 *
 */
public class File {

    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String  fileId;
    /**
     * Optional. File size, if known
     */
    @JsonProperty("file_size")
    private Integer fileSize;
    /**
     * Optional. File path. Use https://api.telegram.org/file/bot<token>/<file_path>
     * to get the file.
     */
    @JsonProperty("file_path")
    private String  filePath;

    /**
     * @return the fileId
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @return the fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * @param fileId the fileId to set
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @param fileSize the fileSize to set
     */
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
