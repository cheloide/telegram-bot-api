package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about why a request was unsuccessful.
 * 
 * @author Marcelo González
 *
 */
public class ResponseParameters {
    /**
     * Optional. The group has been migrated to a supergroup with the specified
     * identifier. This number may be greater than 32 bits and some programming
     * languages may have difficulty/silent defects in interpreting it. But it is
     * smaller than 52 bits, so a signed 64 bit integer or double-precision float
     * type are safe for storing this identifier.
     */
    @JsonProperty("migrate_to_chat_id")
    private Integer migrateToChatId;

    /**
     * Optional. In case of exceeding flood control, the number of seconds left to
     * wait before the request can be repeated
     */
    @JsonProperty("retry_after")
    private Integer retryAfter;

    /**
     * @return the migrateToChatId
     */
    public Integer getMigrateToChatId() {
        return migrateToChatId;
    }

    /**
     * @return the retryAfter
     */
    public Integer getRetryAfter() {
        return retryAfter;
    }

    /**
     * @param migrateToChatId the migrateToChatId to set
     */
    public void setMigrateToChatId(Integer migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    /**
     * @param retryAfter the retryAfter to set
     */
    public void setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
    }
}
