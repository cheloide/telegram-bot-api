package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object contains information about one answer option in a poll.
 * 
 * @author marcelo
 *
 * @see <a href="https://core.telegram.org/bots/api#polloption">https://core.telegram.org/bots/api#polloption</a>
 *
 */
public class PollOption {
    /**
     * Option text, 1-100 characters
     */
    @JsonProperty("text")
    private String  text;
    /**
     * Number of users that voted for this option
     */
    @JsonProperty("voter_count")
    private Integer voterCount;

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the voterCount
     */
    public Integer getVoterCount() {
        return voterCount;
    }

    /**
     * @param voterCount the voterCount to set
     */
    public void setVoterCount(Integer voterCount) {
        this.voterCount = voterCount;
    }

}
