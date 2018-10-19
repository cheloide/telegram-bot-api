package com.github.cheloide.telegrambotapi.model.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.cheloide.telegrambotapi.model.common.PhotoSize;

/**
 * This object represents a sticker.
 * 
 * @author Marcelo González
 *
 */
public class Sticker {
    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String       fileId;
    /**
     * Sticker width
     */
    @JsonProperty("width")
    private Integer      width;
    /**
     * Sticker height
     */
    @JsonProperty("height")
    private Integer      height;
    /**
     * Optional. Sticker thumbnail in the .webp or .jpg format
     */
    @JsonProperty("thumb")
    private PhotoSize    thumb;
    /**
     * Optional. Emoji associated with the sticker
     */
    @JsonProperty("emoji")
    private String       emoji;
    /**
     * Optional. Name of the sticker set to which the sticker belongs
     */
    @JsonProperty("set_name")
    private String       setName;
    /**
     * Optional. For mask stickers, the position where the mask should be placed
     */
    @JsonProperty("mask_position")
    private MaskPosition maskPosition;
    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer      fileSize;

    /**
     * @return the emoji
     */
    public String getEmoji() {
        return emoji;
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
     * @return the maskPosition
     */
    public MaskPosition getMaskPosition() {
        return maskPosition;
    }

    /**
     * @return the setName
     */
    public String getSetName() {
        return setName;
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
     * @param emoji the emoji to set
     */
    public void setEmoji(String emoji) {
        this.emoji = emoji;
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
     * @param maskPosition the maskPosition to set
     */
    public void setMaskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
    }

    /**
     * @param setName the setName to set
     */
    public void setSetName(String setName) {
        this.setName = setName;
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
