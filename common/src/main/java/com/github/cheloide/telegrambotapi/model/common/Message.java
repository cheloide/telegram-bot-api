package com.github.cheloide.telegrambotapi.model.common;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.cheloide.telegrambotapi.model.game.Game;
import com.github.cheloide.telegrambotapi.model.passport.PassportData;
import com.github.cheloide.telegrambotapi.model.payment.Invoice;
import com.github.cheloide.telegrambotapi.model.payment.SuccessfulPayment;
import com.github.cheloide.telegrambotapi.model.sticker.Sticker;

/**
 * This object represents a message.
 * 
 * @author Marcelo González
 * @see <a href="https://core.telegram.org/bots/api#message">https://core.telegram.org/bots/api#message</a>
 */
public class Message {

    /**
     * Unique message identifier inside this chat
     */
    @JsonProperty("message_id")
    private long                messageId;
    /**
     * Optional. Sender, empty for messages sent to channels
     */
    @JsonProperty("from")
    private User                from;
    /**
     * Date the message was sent in Unix time
     */
    @JsonProperty("date")
    private Date                date;
    /**
     * Conversation the message belongs to
     */
    @JsonProperty("chat")
    private Chat                chat;
    /**
     * Optional. For forwarded messages, sender of the original message
     */
    @JsonProperty("forward_from")
    private User                forwardFrom;
    /**
     * Optional. For messages forwarded from channels, information about the
     * original channel
     */
    @JsonProperty("forward_from_chat")
    private Chat                forwardFromChat;
    /**
     * Optional. For messages forwarded from channels, identifier of the original
     * message in the channel
     */
    @JsonProperty("forward_from_message_id")
    private Integer             forwardFromMessageId;
    /**
     * Optional. For messages forwarded from channels, signature of the post author
     * if present
     */
    @JsonProperty("forward_signature")
    private String              forwardSignature;
    /**
     * Optional. Sender's name for messages forwarded from users who disallow adding a link to their account in forwarded messages
     */
    @JsonProperty("forward_sender_name")
    private String              forwardSenderName;
    /**
     * Optional. For forwarded messages, date the original message was sent in Unix
     * time
     */
    @JsonProperty("forward_date")
    private Long                forwardDate;
    /**
     * Optional. For replies, the original message. Note that the Message object in
     * this field will not contain further reply_to_message fields even if it itself
     * is a reply.
     */
    @JsonProperty("reply_to_message")
    private Message             replyToMessage;
    /**
     * Optional. Date the message was last edited in Unix time
     */
    @JsonProperty("edit_date")
    private Long                editDate;
    /**
     * Optional. The unique identifier of a media message group this message belongs
     * to
     */
    @JsonProperty("media_group_id")
    private String              mediaGroupId;
    /**
     * Optional. Signature of the post author for messages in channels
     */
    @JsonProperty("author_signature")
    private String              authorSignature;
    /**
     * Optional. For text messages, the actual UTF-8 text of the message, 0-4096
     * characters.
     */
    @JsonProperty("text")
    private String              text;
    /**
     * Optional. For text messages, special entities like usernames, URLs, bot
     * commands, etc. that appear in the text
     */
    @JsonProperty("entities")
    private List<MessageEntity> entities;
    /**
     * Optional. For messages with a caption, special entities like usernames, URLs,
     * bot commands, etc. that appear in the caption
     */
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;
    /**
     * Optional. Message is an audio file, information about the file
     */
    @JsonProperty("audio")
    private Audio               audio;
    /**
     * Optional. Message is a general file, information about the file
     */
    @JsonProperty("document")
    private Document            document;
    /**
     * Optional. Message is an animation, information about the animation. For
     * backward compatibility, when this field is set, the document field will also
     * be set
     */
    @JsonProperty("animation")
    private Animation           animation;
    /**
     * Optional. Message is a game, information about the game. More about games »
     */
    @JsonProperty("game")
    private Game                game;
    /**
     * of PhotoSize Optional. Message is a photo, available sizes of the photo
     */
    @JsonProperty("photo")
    private List<PhotoSize>     photo;
    /**
     * Optional. Message is a sticker, information about the sticker
     */
    @JsonProperty("sticker")
    private Sticker             sticker;
    /**
     * Optional. Message is a video, information about the video
     */
    @JsonProperty("video")
    private Video               video;
    /**
     * Optional. Message is a voice message, information about the file
     */
    @JsonProperty("voice")
    private Voice               voice;
    /**
     * Optional. Message is a video note, information about the video message
     */
    @JsonProperty("video_note")
    private VideoNote           videoNote;
    /**
     * Optional. Caption for the audio, document, photo, video or voice, 0-200
     * characters
     */
    @JsonProperty("caption")
    private String              caption;
    /**
     * Optional. Message is a shared contact, information about the contact
     */
    @JsonProperty("contact")
    private Contact             contact;
    /**
     * Optional. Message is a shared location, information about the location
     */
    @JsonProperty("location")
    private Location            location;
    /**
     * Optional. Message is a venue, information about the venue
     */
    @JsonProperty("venue")
    private Venue               venue;

    /**
     * Optional. Message is a native poll, information about the poll
     */
    @JsonProperty("poll")
    private Poll              poll;
    /**
     * Optional. New members that were added to the group or supergroup and
     * information about them (the bot itself may be one of these members)
     */
    @JsonProperty("new_chat_members")
    private List<User>        newChatMembers;
    /**
     * Optional. A member was removed from the group, information about them (this
     * member may be the bot itself)
     */
    @JsonProperty("left_chat_member")
    private User              leftChatMember;
    /**
     * Optional. A chat title was changed to this value
     */
    @JsonProperty("new_chat_title")
    private String            newChatTitle;
    /**
     * of PhotoSize Optional. A chat photo was change to this value
     */
    @JsonProperty("new_chat_photo")
    private List<PhotoSize>   newChatPhoto;
    /**
     * Optional. Service message: the chat photo was deleted
     */
    @JsonProperty("delete_chat_photo")
    private Boolean           deleteChatPhoto;
    /**
     * Optional. Service message: the group has been created
     */
    @JsonProperty("group_chat_created")
    private Boolean           groupChatCreated;
    /**
     * Optional. Service message: the supergroup has been created. This field can‘t
     * be received in a message coming through updates, because bot can’t be a
     * member of a supergroup when it is created. It can only be found in
     * reply_to_message if someone replies to a very first message in a directly
     * created supergroup.
     */
    @JsonProperty("supergroup_chat_created")
    private Boolean           supergroupChatCreated;
    /**
     * Optional. Service message: the channel has been created. This field can‘t be
     * received in a message coming through updates, because bot can’t be a member
     * of a channel when it is created. It can only be found in reply_to_message if
     * someone replies to a very first message in a channel.
     */
    @JsonProperty("channel_chat_created")
    private Boolean           channelChatCreated;
    /**
     * Optional. The group has been migrated to a supergroup with the specified
     * identifier. This number may be greater than 32 bits and some programming
     * languages may have difficulty/silent defects in interpreting it. But it is
     * smaller than 52 bits, so a signed 64 bit integer or double-precision float
     * type are safe for storing this identifier.
     */
    @JsonProperty("migrate_to_chat_id")
    private Long              migrateToChatId;
    /**
     * Optional. The supergroup has been migrated from a group with the specified
     * identifier. This number may be greater than 32 bits and some programming
     * languages may have difficulty/silent defects in interpreting it. But it is
     * smaller than 52 bits, so a signed 64 bit integer or double-precision float
     * type are safe for storing this identifier.
     */
    @JsonProperty("migrate_from_chat_id")
    private Long              migrateFromChatId;
    /**
     * Optional. Specified message was pinned. Note that the Message object in this
     * field will not contain further reply_to_message fields even if it is itself a
     * reply.
     */
    @JsonProperty("pinned_message")
    private Message           pinnedMessage;
    /**
     * Optional. Message is an invoice for a payment, information about the invoice.
     * More about payments »
     */
    @JsonProperty("invoice")
    private Invoice           invoice;
    /**
     * Optional. Message is a service message about a successful payment,
     * information about the payment. More about payments »
     */
    @JsonProperty("successful_payment")
    private SuccessfulPayment successfulPayment;
    /**
     * Optional. The domain name of the website on which the user has logged in.
     * More about Telegram Login »
     */
    @JsonProperty("connected_website")
    private String            connectedWebsite;
    /**
     * Optional. Telegram Passport data
     */
    @JsonProperty("passport_data")
    private PassportData      passportData;

    /**
     * Optional. Inline keyboard attached to the message. <strong>login_url</strong> buttons are represented as ordinary <b>url</b> buttons.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * @return the animation
     */
    public Animation getAnimation() {
        return animation;
    }

    /**
     * @return the audio
     */
    public Audio getAudio() {
        return audio;
    }

    /**
     * @return the authorSignature
     */
    public String getAuthorSignature() {
        return authorSignature;
    }

    /**
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * @return the captionEntities
     */
    public List<MessageEntity> getCaptionEntities() {
        return captionEntities;
    }

    /**
     * @return the channelChatCreated
     */
    public Boolean getChannelChatCreated() {
        return channelChatCreated;
    }

    /**
     * @return the chat
     */
    public Chat getChat() {
        return chat;
    }

    /**
     * @return the connectedWebsite
     */
    public String getConnectedWebsite() {
        return connectedWebsite;
    }

    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the deleteChatPhoto
     */
    public Boolean getDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    /**
     * @return the document
     */
    public Document getDocument() {
        return document;
    }

    /**
     * @return the editDate
     */
    public Long getEditDate() {
        return editDate;
    }

    /**
     * @return the entities
     */
    public List<MessageEntity> getEntities() {
        return entities;
    }

    /**
     * @return the forwardDate
     */
    public Long getForwardDate() {
        return forwardDate;
    }

    /**
     * @return the forwardFrom
     */
    public User getForwardFrom() {
        return forwardFrom;
    }

    /**
     * @return the forwardFromChat
     */
    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    /**
     * @return the forwardFromMessageId
     */
    public Integer getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    /**
     * @return the forwardSenderName
     */
    public String getForwardSenderName() {
        return forwardSenderName;
    }

    /**
     * @return the forwardSignature
     */
    public String getForwardSignature() {
        return forwardSignature;
    }

    /**
     * @return the from
     */
    public User getFrom() {
        return from;
    }

    /**
     * @return the game
     */
    public Game getGame() {
        return game;
    }

    /**
     * @return the groupChatCreated
     */
    public Boolean getGroupChatCreated() {
        return groupChatCreated;
    }

    /**
     * @return the invoice
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * @return the leftChatMember
     */
    public User getLeftChatMember() {
        return leftChatMember;
    }

    /**
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @return the mediaGroupId
     */
    public String getMediaGroupId() {
        return mediaGroupId;
    }

    /**
     * @return the messageId
     */
    public long getMessageId() {
        return messageId;
    }

    /**
     * @return the migrateFromChatId
     */
    public Long getMigrateFromChatId() {
        return migrateFromChatId;
    }

    /**
     * @return the migrateToChatId
     */
    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    /**
     * @return the newChatMembers
     */
    public List<User> getNewChatMembers() {
        return newChatMembers;
    }

    /**
     * @return the newChatPhoto
     */
    public List<PhotoSize> getNewChatPhoto() {
        return newChatPhoto;
    }

    /**
     * @return the newChatTitle
     */
    public String getNewChatTitle() {
        return newChatTitle;
    }

    /**
     * @return the passportData
     */
    public PassportData getPassportData() {
        return passportData;
    }

    /**
     * @return the photo
     */
    public List<PhotoSize> getPhoto() {
        return photo;
    }

    /**
     * @return the pinnedMessage
     */
    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    /**
     * @return the replyMarkup
     */
    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    /**
     * @return the replyToMessage
     */
    public Message getReplyToMessage() {
        return replyToMessage;
    }

    /**
     * @return the sticker
     */
    public Sticker getSticker() {
        return sticker;
    }

    /**
     * @return the successfulPayment
     */
    public SuccessfulPayment getSuccessfulPayment() {
        return successfulPayment;
    }

    /**
     * @return the supergroupChatCreated
     */
    public Boolean getSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @return the venue
     */
    public Venue getVenue() {
        return venue;
    }

    /**
     * @return the video
     */
    public Video getVideo() {
        return video;
    }

    /**
     * @return the videoNote
     */
    public VideoNote getVideoNote() {
        return videoNote;
    }

    /**
     * @return the voice
     */
    public Voice getVoice() {
        return voice;
    }

    /**
     * @param animation the animation to set
     */
    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    /**
     * @param audio the audio to set
     */
    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    /**
     * @param authorSignature the authorSignature to set
     */
    public void setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
    }

    /**
     * @param caption the caption to set
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * @param captionEntities the captionEntities to set
     */
    public void setCaptionEntities(List<MessageEntity> captionEntities) {
        this.captionEntities = captionEntities;
    }

    /**
     * @param channelChatCreated the channelChatCreated to set
     */
    public void setChannelChatCreated(Boolean channelChatCreated) {
        this.channelChatCreated = channelChatCreated;
    }

    /**
     * @param chat the chat to set
     */
    public void setChat(Chat chat) {
        this.chat = chat;
    }

    /**
     * @param connectedWebsite the connectedWebsite to set
     */
    public void setConnectedWebsite(String connectedWebsite) {
        this.connectedWebsite = connectedWebsite;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @param deleteChatPhoto the deleteChatPhoto to set
     */
    public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
        this.deleteChatPhoto = deleteChatPhoto;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * @param editDate the editDate to set
     */
    public void setEditDate(Long editDate) {
        this.editDate = editDate;
    }

    /**
     * @param entities the entities to set
     */
    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    /**
     * @param forwardDate the forwardDate to set
     */
    public void setForwardDate(Long forwardDate) {
        this.forwardDate = forwardDate;
    }

    /**
     * @param forwardFrom the forwardFrom to set
     */
    public void setForwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;
    }

    /**
     * @param forwardFromChat the forwardFromChat to set
     */
    public void setForwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;
    }

    /**
     * @param forwardFromMessageId the forwardFromMessageId to set
     */
    public void setForwardFromMessageId(Integer forwardFromMessageId) {
        this.forwardFromMessageId = forwardFromMessageId;
    }

    /**
     * @param forwardSenderName the forwardSenderName to set
     */
    public void setForwardSenderName(String forwardSenderName) {
        this.forwardSenderName = forwardSenderName;
    }

    /**
     * @param forwardSignature the forwardSignature to set
     */
    public void setForwardSignature(String forwardSignature) {
        this.forwardSignature = forwardSignature;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(User from) {
        this.from = from;
    }

    /**
     * @param game the game to set
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * @param groupChatCreated the groupChatCreated to set
     */
    public void setGroupChatCreated(Boolean groupChatCreated) {
        this.groupChatCreated = groupChatCreated;
    }

    /**
     * @param invoice the invoice to set
     */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    /**
     * @param leftChatMember the leftChatMember to set
     */
    public void setLeftChatMember(User leftChatMember) {
        this.leftChatMember = leftChatMember;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @param mediaGroupId the mediaGroupId to set
     */
    public void setMediaGroupId(String mediaGroupId) {
        this.mediaGroupId = mediaGroupId;
    }

    /**
     * @param messageId the messageId to set
     */
    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    /**
     * @param migrateFromChatId the migrateFromChatId to set
     */
    public void setMigrateFromChatId(Long migrateFromChatId) {
        this.migrateFromChatId = migrateFromChatId;
    }

    /**
     * @param migrateToChatId the migrateToChatId to set
     */
    public void setMigrateToChatId(Long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    /**
     * @param newChatMembers the newChatMembers to set
     */
    public void setNewChatMembers(List<User> newChatMembers) {
        this.newChatMembers = newChatMembers;
    }

    /**
     * @param newChatPhoto the newChatPhoto to set
     */
    public void setNewChatPhoto(List<PhotoSize> newChatPhoto) {
        this.newChatPhoto = newChatPhoto;
    }

    /**
     * @param newChatTitle the newChatTitle to set
     */
    public void setNewChatTitle(String newChatTitle) {
        this.newChatTitle = newChatTitle;
    }

    /**
     * @param passportData the passportData to set
     */
    public void setPassportData(PassportData passportData) {
        this.passportData = passportData;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    /**
     * @param pinnedMessage the pinnedMessage to set
     */
    public void setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
    }

    /**
     * @param replyMarkup the replyMarkup to set
     */
    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    /**
     * @param replyToMessage the replyToMessage to set
     */
    public void setReplyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;
    }

    /**
     * @param sticker the sticker to set
     */
    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    /**
     * @param successfulPayment the successfulPayment to set
     */
    public void setSuccessfulPayment(SuccessfulPayment successfulPayment) {
        this.successfulPayment = successfulPayment;
    }

    /**
     * @param supergroupChatCreated the supergroupChatCreated to set
     */
    public void setSupergroupChatCreated(Boolean supergroupChatCreated) {
        this.supergroupChatCreated = supergroupChatCreated;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @param venue the venue to set
     */
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    /**
     * @param video the video to set
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * @param videoNote the videoNote to set
     */
    public void setVideoNote(VideoNote videoNote) {
        this.videoNote = videoNote;
    }

    /**
     * @param voice the voice to set
     */
    public void setVoice(Voice voice) {
        this.voice = voice;
    }
}
