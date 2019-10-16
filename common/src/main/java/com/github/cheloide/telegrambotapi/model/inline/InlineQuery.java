package com.github.cheloide.telegrambotapi.model.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.cheloide.telegrambotapi.model.common.Location;
import com.github.cheloide.telegrambotapi.model.common.User;

/**
 * This object represents an incoming inline query. When the user sends an empty
 * query, your bot could return some default or trending results.
 * 
 * @author Marcelo González
 *
 */
public class InlineQuery {
    /**
     * Unique identifier for this query
     */
    @JsonProperty("id")
    private String   id;
    /**
     * Sender
     */
    @JsonProperty("from")
    private User     from;
    /**
     * Optional. Sender location, only for bots that request user location
     */
    @JsonProperty("location")
    private Location location;
    /**
     * Text of the query (up to 512 characters)
     */
    @JsonProperty("query")
    private String   query;
    /**
     * Offset of the results to be returned, can be controlled by the bot
     */
    @JsonProperty("offset")
    private String   offset;

    /**
     * @return the from
     */
    public User getFrom() {
        return from;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @return the offset
     */
    public String getOffset() {
        return offset;
    }

    /**
     * @return the query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(User from) {
        this.from = from;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @param offset the offset to set
     */
    public void setOffset(String offset) {
        this.offset = offset;
    }

    /**
     * @param query the query to set
     */
    public void setQuery(String query) {
        this.query = query;
    }
}
