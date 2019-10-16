package com.github.cheloide.telegrambotapi.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represent a user's profile pictures.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#userprofilephotos">https://core.telegram.org/bots/api#userprofilephotos</a>
 */
public class UserProfilePhotos {

    /**
     * Total number of profile pictures the target user has
     */
    @JsonProperty("total_count")
    private Integer               totalCount;
    /**
     * Requested profile pictures (in up to 4 sizes each)
     */
    @JsonProperty("photos")
    private List<List<PhotoSize>> photos;

    /**
     * @return the photos
     */
    public List<List<PhotoSize>> getPhotos() {
        return photos;
    }

    /**
     * @return the total_count
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * @param photos the photos to set
     */
    public void setPhotos(List<List<PhotoSize>> photos) {
        this.photos = photos;
    }

    /**
     * @param total_count the total_count to set
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
