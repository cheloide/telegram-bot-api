/**
 * 
 */
package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes actions that a non-administrator user is allowed to take in a chat.
 * 
 * @author marcelo
 * @see <a href="https://core.telegram.org/bots/api#chatpermissions">https://core.telegram.org/bots/api#chatpermissions</a>
 *
 */
public class ChatPermissions {
    /**
     * Optional. True, if the user is allowed to send text messages, contacts, locations and venues
     */
    @JsonProperty("can_send_messages")
    private Boolean canSendMessages;
    /**
     * Optional. True, if the user is allowed to send audios, documents, photos, videos, video notes and voice notes, implies can_send_messages
     */
    @JsonProperty("can_send_media_messages")
    private Boolean canSendMediaMessages;
    /**
     * Optional. True, if the user is allowed to send polls, implies can_send_messages
     */
    @JsonProperty("can_send_polls")
    private Boolean canSendPolls;
    /**
     * Optional. True, if the user is allowed to send animations, games, stickers and use inline bots, implies can_send_media_messages
     */
    @JsonProperty("can_send_other_messages")
    private Boolean canSendOtherMessages;
    /**
     * Optional. True, if the user is allowed to add web page previews to their messages, implies can_send_media_messages
     */
    @JsonProperty("can_add_web_page_previews")
    private Boolean canAddWebPagePreviews;
    /**
     * Optional. True, if the user is allowed to change the chat title, photo and other settings. Ignored in public supergroups
     */
    @JsonProperty("can_change_info")
    private Boolean canChangeInfo;
    /**
     * Optional. True, if the user is allowed to invite new users to the chat
     */
    @JsonProperty("can_invite_users")
    private Boolean canInviteUsers;
    /**
     * Optional. True, if the user is allowed to pin messages. Ignored in public supergroups
     */
    @JsonProperty("can_pin_messages")
    private Boolean canPinMessages;

    /**
     * @return the canSendMessages
     */
    public Boolean getCanSendMessages() {
        return canSendMessages;
    }

    /**
     * @param canSendMessages the canSendMessages to set
     */
    public void setCanSendMessages(Boolean canSendMessages) {
        this.canSendMessages = canSendMessages;
    }

    /**
     * @return the canSendMediaMessages
     */
    public Boolean getCanSendMediaMessages() {
        return canSendMediaMessages;
    }

    /**
     * @param canSendMediaMessages the canSendMediaMessages to set
     */
    public void setCanSendMediaMessages(Boolean canSendMediaMessages) {
        this.canSendMediaMessages = canSendMediaMessages;
    }

    /**
     * @return the canSendPolls
     */
    public Boolean getCanSendPolls() {
        return canSendPolls;
    }

    /**
     * @param canSendPolls the canSendPolls to set
     */
    public void setCanSendPolls(Boolean canSendPolls) {
        this.canSendPolls = canSendPolls;
    }

    /**
     * @return the canSendOtherMessages
     */
    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    /**
     * @param canSendOtherMessages the canSendOtherMessages to set
     */
    public void setCanSendOtherMessages(Boolean canSendOtherMessages) {
        this.canSendOtherMessages = canSendOtherMessages;
    }

    /**
     * @return the canAddWebPagePreviews
     */
    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    /**
     * @param canAddWebPagePreviews the canAddWebPagePreviews to set
     */
    public void setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
        this.canAddWebPagePreviews = canAddWebPagePreviews;
    }

    /**
     * @return the canChangeInfo
     */
    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    /**
     * @param canChangeInfo the canChangeInfo to set
     */
    public void setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
    }

    /**
     * @return the canInviteUsers
     */
    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    /**
     * @param canInviteUsers the canInviteUsers to set
     */
    public void setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
    }

    /**
     * @return the canPinMessages
     */
    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    /**
     * @param canPinMessages the canPinMessages to set
     */
    public void setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
    }

}
