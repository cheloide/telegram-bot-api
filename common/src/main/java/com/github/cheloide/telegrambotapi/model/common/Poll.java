/**
 * 
 */
package com.github.cheloide.telegrambotapi.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object contains information about a poll.
 * 
 * @author marcelo
 *
 * @see <a href="https://core.telegram.org/bots/api#poll">https://core.telegram.org/bots/api#poll</a>
 */
public class Poll {
    /**
     * Unique poll identifier
     */
    @JsonProperty("id")
    private String           id;
    /**
     * Poll question, 1-255 characters
     */
    @JsonProperty("question")
    private String           question;
    /**
     * List of poll options
     */
    @JsonProperty("options")
    private List<PollOption> options;
    /**
     * True, if the poll is closed
     */
    @JsonProperty("is_closed")
    private Boolean          isClosed;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the options
     */
    public List<PollOption> getOptions() {
        return options;
    }

    /**
     * @param options the options to set
     */
    public void setOptions(List<PollOption> options) {
        this.options = options;
    }

    /**
     * @return the closed
     */
    public Boolean getIsClosed() {
        return isClosed;
    }

    /**
     * @param closed the closed to set
     */
    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

}
