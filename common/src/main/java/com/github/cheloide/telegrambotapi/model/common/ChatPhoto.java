package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a chat photo.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#chatphoto">https://core.telegram.org/bots/api#chatphoto</a>
 * 
 */
public class ChatPhoto {
    /**
     * Unique file identifier of small (160x160) chat photo. This file_id can be
     * used only for photo download.
     */
    @JsonProperty("small_file_id")
    private String smallFileId;
    /**
     * Unique file identifier of big (640x640) chat photo. This file_id can be used
     * only for photo download.
     */
    @JsonProperty("big_file_id")
    private String bigFileId;

    /**
     * @return the bigFileId
     */
    public String getBigFileId() {
        return bigFileId;
    }

    /**
     * @return the smallFileId
     */
    public String getSmallFileId() {
        return smallFileId;
    }

    /**
     * @param bigFileId the bigFileId to set
     */
    public void setBigFileId(String bigFileId) {
        this.bigFileId = bigFileId;
    }

    /**
     * @param smallFileId the smallFileId to set
     */
    public void setSmallFileId(String smallFileId) {
        this.smallFileId = smallFileId;
    }
}
