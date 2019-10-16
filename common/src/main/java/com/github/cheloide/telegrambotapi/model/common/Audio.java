package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents an audio file to be treated as music by the Telegram
 * clients.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#audio">https://core.telegram.org/bots/api#audio</a>
 * 
 * 
 */
public class Audio {
    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String    fileId;
    /**
     * Duration of the audio in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer   duration;
    /**
     * Optional. Performer of the audio as defined by sender or by audio tags
     */
    @JsonProperty("performer")
    private String    performer;
    /**
     * Optional. Title of the audio as defined by sender or by audio tags
     */
    @JsonProperty("title")
    private String    title;
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
     * Optional. Thumbnail of the album cover to which the music file belongs
     */
    @JsonProperty("thumb")
    private PhotoSize thumb;

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
     * @return the performer
     */
    public String getPerformer() {
        return performer;
    }

    /**
     * @return the thumb
     */
    public PhotoSize getThumb() {
        return thumb;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
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

    /**
     * @param performer the performer to set
     */
    public void setPerformer(String performer) {
        this.performer = performer;
    }

    /**
     * @param thumb the thumb to set
     */
    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
