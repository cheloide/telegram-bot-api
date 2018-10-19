package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a point on the map.
 * 
 * @author Marcelo González
 *
 */
public class Location {
    /**
     * Longitude as defined by sender
     */
    @JsonProperty("longitude")
    private Float longitude;
    /**
     * Latitude as defined by sender
     */
    @JsonProperty("latitude")
    private Float latitude;

    /**
     * @return the latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * @return the longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }
}
