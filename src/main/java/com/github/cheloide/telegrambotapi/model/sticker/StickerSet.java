package com.github.cheloide.telegrambotapi.model.sticker;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a sticker set.
 * 
 * @author Marcelo González
 *
 */
public class StickerSet {
    /**
     * Sticker set name
     */
    @JsonProperty("name")
    private String        name;
    /**
     * Sticker set title
     */
    @JsonProperty("title")
    private String        title;
    /**
     * True, if the sticker set contains masks
     */
    @JsonProperty("contains_masks")
    private Boolean       containsMasks;
    /**
     * List of all set stickers
     */
    @JsonProperty("stickers")
    private List<Sticker> stickers;

    /**
     * @return the containsMasks
     */
    public Boolean getContainsMasks() {
        return containsMasks;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the stickers
     */
    public List<Sticker> getStickers() {
        return stickers;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param containsMasks the containsMasks to set
     */
    public void setContainsMasks(Boolean containsMasks) {
        this.containsMasks = containsMasks;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param stickers the stickers to set
     */
    public void setStickers(List<Sticker> stickers) {
        this.stickers = stickers;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
