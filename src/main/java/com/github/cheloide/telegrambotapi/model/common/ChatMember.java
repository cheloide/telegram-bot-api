package com.github.cheloide.telegrambotapi.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object contains information about one member of a chat.
 * 
 * @author Marcelo González
 *
 */
public class ChatMember {
    /**
     * Information about the user
     */
    @JsonProperty("user")
    private User    user;
    /**
     * The member's status in the chat. Can be “creator”, “administrator”, “member”,
     * “restricted”, “left” or “kicked”
     */
    @JsonProperty("status")
    private String  status;
    /**
     * Optional. Restricted and kicked only. Date when restrictions will be lifted
     * for this user, unix time
     */
    @JsonProperty("until_date")
    private Integer untilDate;
    /**
     * Optional. Administrators only. True, if the bot is allowed to edit
     * administrator privileges of that user
     */
    @JsonProperty("can_be_edited")
    private Boolean canBeEdited;
    /**
     * Optional. Administrators only. True, if the administrator can change the chat
     * title, photo and other settings
     */
    @JsonProperty("can_change_info")
    private Boolean canChangeInfo;
    /**
     * Optional. Administrators only. True, if the administrator can post in the
     * channel, channels only
     */
    @JsonProperty("can_post_messages")
    private Boolean canPostMessages;
    /**
     * Optional. Administrators only. True, if the administrator can edit messages
     * of other users and can pin messages, channels only
     */
    @JsonProperty("can_edit_messages")
    private Boolean canEditMessages;
    /**
     * Optional. Administrators only. True, if the administrator can delete messages
     * of other users
     */
    @JsonProperty("can_delete_messages")
    private Boolean canDeleteMessages;
    /**
     * Optional. Administrators only. True, if the administrator can invite new
     * users to the chat
     */
    @JsonProperty("can_invite_users")
    private Boolean canInviteUsers;
    /**
     * Optional. Administrators only. True, if the administrator can restrict, ban
     * or unban chat members
     */
    @JsonProperty("can_restrict_members")
    private Boolean canRestrictMembers;
    /**
     * Optional. Administrators only. True, if the administrator can pin messages,
     * supergroups only
     */
    @JsonProperty("can_pin_messages")
    private Boolean canPinMessages;
    /**
     * Optional. Administrators only. True, if the administrator can add new
     * administrators with a subset of his own privileges or demote administrators
     * that he has promoted, directly or indirectly (promoted by administrators that
     * were appointed by the user)
     */
    @JsonProperty("can_promote_members")
    private Boolean canPromoteMembers;
    /**
     * Optional. Restricted only. True, if the user can send text messages,
     * contacts, locations and venues
     */
    @JsonProperty("can_send_messages")
    private Boolean canSendMessages;
    /**
     * Optional. Restricted only. True, if the user can send audios, documents,
     * photos, videos, video notes and voice notes, implies can_send_messages
     */
    @JsonProperty("can_send_media_messages")
    private Boolean canSendMediaMessages;
    /**
     * Optional. Restricted only. True, if the user can send animations, games,
     * stickers and use inline bots, implies can_send_media_messages
     */
    @JsonProperty("can_send_other_messages")
    private Boolean canSendOtherMessages;
    /**
     * Optional. Restricted only. True, if user may add web page previews to his
     * messages, implies can_send_media_messages
     */
    @JsonProperty("can_add_web_page_previews")
    private Boolean canAddWebPagePreviews;

    /**
     * @return the canAddWebPagePreviews
     */
    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    /**
     * @return the canBeEdited
     */
    public Boolean getCanBeEdited() {
        return canBeEdited;
    }

    /**
     * @return the canChangeInfo
     */
    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    /**
     * @return the canDeleteMessages
     */
    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    /**
     * @return the canEditMessages
     */
    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    /**
     * @return the canInviteUsers
     */
    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    /**
     * @return the canPinMessages
     */
    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    /**
     * @return the canPostMessages
     */
    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    /**
     * @return the canPromoteMembers
     */
    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    /**
     * @return the canRestrictMembers
     */
    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    /**
     * @return the canSendMediaMessages
     */
    public Boolean getCanSendMediaMessages() {
        return canSendMediaMessages;
    }

    /**
     * @return the canSendMessages
     */
    public Boolean getCanSendMessages() {
        return canSendMessages;
    }

    /**
     * @return the canSendOtherMessages
     */
    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return the untilDate
     */
    public Integer getUntilDate() {
        return untilDate;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param canAddWebPagePreviews the canAddWebPagePreviews to set
     */
    public void setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
        this.canAddWebPagePreviews = canAddWebPagePreviews;
    }

    /**
     * @param canBeEdited the canBeEdited to set
     */
    public void setCanBeEdited(Boolean canBeEdited) {
        this.canBeEdited = canBeEdited;
    }

    /**
     * @param canChangeInfo the canChangeInfo to set
     */
    public void setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
    }

    /**
     * @param canDeleteMessages the canDeleteMessages to set
     */
    public void setCanDeleteMessages(Boolean canDeleteMessages) {
        this.canDeleteMessages = canDeleteMessages;
    }

    /**
     * @param canEditMessages the canEditMessages to set
     */
    public void setCanEditMessages(Boolean canEditMessages) {
        this.canEditMessages = canEditMessages;
    }

    /**
     * @param canInviteUsers the canInviteUsers to set
     */
    public void setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
    }

    /**
     * @param canPinMessages the canPinMessages to set
     */
    public void setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
    }

    /**
     * @param canPostMessages the canPostMessages to set
     */
    public void setCanPostMessages(Boolean canPostMessages) {
        this.canPostMessages = canPostMessages;
    }

    /**
     * @param canPromoteMembers the canPromoteMembers to set
     */
    public void setCanPromoteMembers(Boolean canPromoteMembers) {
        this.canPromoteMembers = canPromoteMembers;
    }

    /**
     * @param canRestrictMembers the canRestrictMembers to set
     */
    public void setCanRestrictMembers(Boolean canRestrictMembers) {
        this.canRestrictMembers = canRestrictMembers;
    }

    /**
     * @param canSendMediaMessages the canSendMediaMessages to set
     */
    public void setCanSendMediaMessages(Boolean canSendMediaMessages) {
        this.canSendMediaMessages = canSendMediaMessages;
    }

    /**
     * @param canSendMessages the canSendMessages to set
     */
    public void setCanSendMessages(Boolean canSendMessages) {
        this.canSendMessages = canSendMessages;
    }

    /**
     * @param canSendOtherMessages the canSendOtherMessages to set
     */
    public void setCanSendOtherMessages(Boolean canSendOtherMessages) {
        this.canSendOtherMessages = canSendOtherMessages;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @param untilDate the untilDate to set
     */
    public void setUntilDate(Integer untilDate) {
        this.untilDate = untilDate;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
}
