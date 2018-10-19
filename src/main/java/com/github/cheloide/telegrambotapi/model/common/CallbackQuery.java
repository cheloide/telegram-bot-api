package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents an incoming callback query from a callback button in
 * an inline keyboard. If the button that originated the query was attached to a
 * message sent by the bot, the field message will be present. If the button was
 * attached to a message sent via the bot (in inline mode), the field
 * inline_message_id will be present. Exactly one of the fields data or
 * game_short_name will be present.
 * 
 * NOTE: After the user presses a callback button, Telegram clients will display
 * a progress bar until you call answerCallbackQuery. It is, therefore,
 * necessary to react by calling answerCallbackQuery even if no notification to
 * the user is needed (e.g., without specifying any of the optional parameters).
 * 
 * @author Marcelo González
 *
 */
public class CallbackQuery {
    /**
     * Unique identifier for this query
     */
    @JsonProperty("id")
    private String  id;
    /**
     * Sender
     */
    @JsonProperty("from")
    private User    from;
    /**
     * Optional. Message with the callback button that originated the query. Note
     * that message content and message date will not be available if the message is
     * too old
     */
    @JsonProperty("message")
    private Message message;
    /**
     * Optional. Identifier of the message sent via the bot in inline mode, that
     * originated the query.
     */
    @JsonProperty("inline_message_id")
    private String  inlineMessageId;
    /**
     * Global identifier, uniquely corresponding to the chat to which the message
     * with the callback button was sent. Useful for high scores in games.
     */
    @JsonProperty("chat_instance")
    private String  chatInstance;
    /**
     * Optional. Data associated with the callback button. Be aware that a bad
     * client can send arbitrary data in this field.
     */
    @JsonProperty("data")
    private String  data;
    /**
     * Optional. Short name of a Game to be returned, serves as the unique
     * identifier for the game
     */
    @JsonProperty("game_short_name")
    private String  gameShortName;

    /**
     * @return the chatInstance
     */
    public String getChatInstance() {
        return chatInstance;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @return the from
     */
    public User getFrom() {
        return from;
    }

    /**
     * @return the gameShortName
     */
    public String getGameShortName() {
        return gameShortName;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the inlineMessageId
     */
    public String getInlineMessageId() {
        return inlineMessageId;
    }

    /**
     * @return the message
     */
    public Message getMessage() {
        return message;
    }

    /**
     * @param chatInstance the chatInstance to set
     */
    public void setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(User from) {
        this.from = from;
    }

    /**
     * @param gameShortName the gameShortName to set
     */
    public void setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param inlineMessageId the inlineMessageId to set
     */
    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(Message message) {
        this.message = message;
    }
}
