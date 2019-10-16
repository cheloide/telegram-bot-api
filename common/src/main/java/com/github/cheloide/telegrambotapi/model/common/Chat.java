package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a chat.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#chat">https://core.telegram.org/bots/api#chat</a> 
 *   
 *
 */
public class Chat {
    /**
     * Unique identifier for this chat. This number may be greater than 32 bits and
     * some programming languages may have difficulty/silent defects in interpreting
     * it. But it is smaller than 52 bits, so a signed 64 bit integer or
     * double-precision float type are safe for storing this identifier.
     */
    @JsonProperty("id")
    private long      id;
    /**
     * Type of chat, can be either “private”, “group”, “supergroup” or “channel”
     */
    @JsonProperty("type")
    private String    type;
    /**
     * Optional. Title, for supergroups, channels and group chats
     */
    @JsonProperty("title")
    private String    title;
    /**
     * Optional. Username, for private chats, supergroups and channels if available
     */
    @JsonProperty("username")
    private String    username;
    /**
     * Optional. First name of the other party in a private chat
     */
    @JsonProperty("first_name")
    private String    firstName;
    /**
     * Optional. Last name of the other party in a private chat
     */
    @JsonProperty("last_name")
    private String    lastName;

    /**
     * Optional. Chat photo. Returned only in getChat.
     */
    @JsonProperty("photo")
    private ChatPhoto photo;
    /**
     * Optional. Description, for supergroups and channel chats. Returned only in
     * getChat.
     */
    @JsonProperty("description")
    private String    description;
    /**
     * Optional. Chat invite link, for supergroups and channel chats. Returned only
     * in getChat.
     */
    @JsonProperty("invite_link")
    private String    inviteLink;
    /**
     * Optional. Pinned message, for supergroups and channel chats. Returned only in
     * getChat.
     */
    @JsonProperty("pinned_message")
    private Message   pinnedMessage;
    /**
     * Optional. For supergroups, name of group sticker set. Returned only in
     * getChat.
     */
    @JsonProperty("sticker_set_name")
    private String    stickerSetName;
    /**
     * Optional. True, if the bot can change the group sticker set. Returned only in
     * getChat.
     */
    @JsonProperty("can_set_sticker_set")
    private Boolean   canSetStickerSet;


    /**
     * @return the canSetStickerSet
     */
    public Boolean getCanSetStickerSet() {
        return canSetStickerSet;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the inviteLink
     */
    public String getInviteLink() {
        return inviteLink;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the photo
     */
    public ChatPhoto getPhoto() {
        return photo;
    }

    /**
     * @return the pinnedMessage
     */
    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    /**
     * @return the stickerSetName
     */
    public String getStickerSetName() {
        return stickerSetName;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param canSetStickerSet the canSetStickerSet to set
     */
    public void setCanSetStickerSet(Boolean canSetStickerSet) {
        this.canSetStickerSet = canSetStickerSet;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @param inviteLink the inviteLink to set
     */
    public void setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(ChatPhoto photo) {
        this.photo = photo;
    }

    /**
     * @param pinnedMessage the pinnedMessage to set
     */
    public void setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
    }

    /**
     * @param stickerSetName the stickerSetName to set
     */
    public void setStickerSetName(String stickerSetName) {
        this.stickerSetName = stickerSetName;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

}
