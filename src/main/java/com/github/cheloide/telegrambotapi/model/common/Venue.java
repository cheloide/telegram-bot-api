package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a venue.
 * 
 * @author Marcelo González
 *
 */
public class Venue {

    /**
     * Venue location
     */
    @JsonProperty("location")
    private Location location;
    /**
     * Name of the venue
     */
    @JsonProperty("title")
    private String   title;
    /**
     * Address of the venue
     */
    @JsonProperty("address")
    private String   address;
    /**
     * Optional. Foursquare identifier of the venue
     */
    @JsonProperty("foursquare_id")
    private String   foursquareId;
    /**
     * Optional. Foursquare type of the venue. (For example,
     * “arts_entertainment/default”, “arts_entertainment/aquarium” or
     * “food/icecream”.)
     */
    @JsonProperty("foursquare_type")
    private String   foursquareType;

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the foursquareId
     */
    public String getFoursquareId() {
        return foursquareId;
    }

    /**
     * @return the foursquareType
     */
    public String getFoursquareType() {
        return foursquareType;
    }

    /**
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param foursquareId the foursquareId to set
     */
    public void setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
    }

    /**
     * @param foursquareType the foursquareType to set
     */
    public void setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
