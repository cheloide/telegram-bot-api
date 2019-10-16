package com.github.cheloide.telegrambotapi.service;

import java.util.List;

import com.github.cheloide.telegrambotapi.domain.AnswerCallbackQueryRequest;
import com.github.cheloide.telegrambotapi.domain.DeleteChatPhotoRequest;
import com.github.cheloide.telegrambotapi.domain.DeleteChatStickerSetRequest;
import com.github.cheloide.telegrambotapi.domain.EditMessageLiveLocationRequest;
import com.github.cheloide.telegrambotapi.domain.ExportChatInviteLinkRequest;
import com.github.cheloide.telegrambotapi.domain.ForwardMessageRequest;
import com.github.cheloide.telegrambotapi.domain.GetChatAdministratorsRequest;
import com.github.cheloide.telegrambotapi.domain.GetChatMemberRequest;
import com.github.cheloide.telegrambotapi.domain.GetChatMembersCountRequest;
import com.github.cheloide.telegrambotapi.domain.GetChatRequest;
import com.github.cheloide.telegrambotapi.domain.GetFileRequest;
import com.github.cheloide.telegrambotapi.domain.GetUserProfilePhotosRequest;
import com.github.cheloide.telegrambotapi.domain.KickChatMemberRequest;
import com.github.cheloide.telegrambotapi.domain.LeaveChatRequest;
import com.github.cheloide.telegrambotapi.domain.PinChatMessageRequest;
import com.github.cheloide.telegrambotapi.domain.PromoteChatMemberRequest;
import com.github.cheloide.telegrambotapi.domain.RestrictChatMemberRequest;
import com.github.cheloide.telegrambotapi.domain.SendAnimationRequest;
import com.github.cheloide.telegrambotapi.domain.SendAudioRequest;
import com.github.cheloide.telegrambotapi.domain.SendChatActionRequest;
import com.github.cheloide.telegrambotapi.domain.SendContactRequest;
import com.github.cheloide.telegrambotapi.domain.SendDocumentRequest;
import com.github.cheloide.telegrambotapi.domain.SendLocationRequest;
import com.github.cheloide.telegrambotapi.domain.SendMediaGroupRequest;
import com.github.cheloide.telegrambotapi.domain.SendMessageRequest;
import com.github.cheloide.telegrambotapi.domain.SendPhotoRequest;
import com.github.cheloide.telegrambotapi.domain.SendVenueRequest;
import com.github.cheloide.telegrambotapi.domain.SendVideoNoteRequest;
import com.github.cheloide.telegrambotapi.domain.SendVideoRequest;
import com.github.cheloide.telegrambotapi.domain.SendVoiceRequest;
import com.github.cheloide.telegrambotapi.domain.SetChatDescriptionRequest;
import com.github.cheloide.telegrambotapi.domain.SetChatPhotoRequest;
import com.github.cheloide.telegrambotapi.domain.SetChatStickerSetRequest;
import com.github.cheloide.telegrambotapi.domain.SetChatTitleRequest;
import com.github.cheloide.telegrambotapi.domain.StopMessageLiveLocationRequest;
import com.github.cheloide.telegrambotapi.domain.UnbanChatMemberRequest;
import com.github.cheloide.telegrambotapi.domain.UnpinChatMessageRequest;
import com.github.cheloide.telegrambotapi.model.api.Response;
import com.github.cheloide.telegrambotapi.model.common.Chat;
import com.github.cheloide.telegrambotapi.model.common.ChatMember;
import com.github.cheloide.telegrambotapi.model.common.File;
import com.github.cheloide.telegrambotapi.model.common.Message;
import com.github.cheloide.telegrambotapi.model.common.User;
import com.github.cheloide.telegrambotapi.model.common.UserProfilePhotos;

public interface TelegramBotApiService {

    // GENERAL API

    /**
     * A simple method for testing your bot's auth token. Requires no parameters.
     * Returns basic information about the bot in form of a User object.
     * 
     * @return
     */
    Response<User> getMe();

    /**
     * Use this method to send text messages. On success, the sent Message is
     * returned.
     * 
     * @param request
     * @return
     */
    Response<Message> sendMessage(SendMessageRequest request);

    /**
     * Use this method to send text messages. On success, the sent Message is
     * returned.
     * 
     * @param chatId Unique identifier for the target chat or username of the target
     *               channel (in the format \@channelusername)
     * @param text   Text of the message to be sent
     * @return
     */
    Response<Message> sendMessage(long chatId, String text);

    /**
     * Use this method to send text messages. On success, the sent Message is
     * returned.
     * 
     * @param chatId                Unique identifier for the target chat or
     *                              username of the target channel (in the format
     *                              \@channelusername)
     * @param text                  Text of the message to be sent
     * @param parseMode             Send Markdown or HTML, if you want Telegram apps
     *                              to show bold, italic, fixed-width text or inline
     *                              URLs in your bot's message.
     * @param disableWebPagePreview Disables link previews for links in this message
     * @param disableNotification   Sends the message silently. Users will receive a
     *                              notification with no sound.
     * @param replyToMessageId      If the message is a reply, ID of the original
     *                              message
     * @return
     */
    Response<Message> sendMessage(long chatId, String text, String parseMode, Boolean disableWebPagePreview, Boolean disableNotification, Integer replyToMessageId);

    Response<Message> forwardMessage(ForwardMessageRequest request);

    Response<Message> sendPhoto(SendPhotoRequest request);

    Response<Message> sendAudio(SendAudioRequest request);

    Response<Message> sendDocument(SendDocumentRequest request);

    Response<Message> sendVideo(SendVideoRequest request);

    Response<Message> sendAnimation(SendAnimationRequest request);

    Response<Message> sendVoice(SendVoiceRequest request);

    Response<Message> sendVideoNote(SendVideoNoteRequest request);

    Response<List<Message>> sendMediaGroup(SendMediaGroupRequest request);

    Response<Message> sendLocation(SendLocationRequest request);

    Response<Message> editMessageLiveLocation(EditMessageLiveLocationRequest request);

    Response<Message> stopMessageLiveLocation(StopMessageLiveLocationRequest request);

    Response<Message> sendVenue(SendVenueRequest request);

    Response<Message> sendContact(SendContactRequest request);

    Response<Boolean> sendChatAction(SendChatActionRequest request);

    Response<UserProfilePhotos> getUserProfilePhotos(GetUserProfilePhotosRequest request);

    Response<File> getFile(GetFileRequest request);

    Response<Boolean> kickChatMember(KickChatMemberRequest request);

    Response<Boolean> unbanChatMember(UnbanChatMemberRequest request);

    Response<Boolean> restrictChatMember(RestrictChatMemberRequest request);

    Response<Boolean> promoteChatMember(PromoteChatMemberRequest request);

    Response<String> exportChatInviteLink(ExportChatInviteLinkRequest request);

    Response<Boolean> setChatPhoto(SetChatPhotoRequest request);

    Response<Boolean> deleteChatPhoto(DeleteChatPhotoRequest request);

    Response<Boolean> setChatTitle(SetChatTitleRequest request);

    Response<Boolean> setChatDescription(SetChatDescriptionRequest request);

    Response<Boolean> pinChatMessage(PinChatMessageRequest request);

    Response<Boolean> unpinChatMessage(UnpinChatMessageRequest request);

    Response<Boolean> leaveChat(LeaveChatRequest request);

    Response<Chat> getChat(GetChatRequest request);

    Response<List<ChatMember>> getChatAdministrators(GetChatAdministratorsRequest request);

    Response<Integer> getChatMembersCount(GetChatMembersCountRequest request);

    Response<ChatMember> getChatMember(GetChatMemberRequest request);

    Response<Boolean> setChatStickerSet(SetChatStickerSetRequest request);

    Response<Boolean> deleteChatStickerSet(DeleteChatStickerSetRequest request);

    Response<Boolean> answerCallbackQuery(AnswerCallbackQueryRequest request);
    //
    // // UPDATE
    //
    // Message editMessageText(EditMessageTextRequest request);
    //
    // Message editMessageCaption(EditMessageCaptionRequest request);
    //
    // Message editMessageMedia(EditMessageMediaRequest request);
    //
    // Message editMessageReplyMarkup(EditMessageReplyMarkupRequest request);
    //
    // Boolean deleteMessage(DeleteMessageRequest request);
    //
    // // STICKERS
    //
    // Message sendSticker(SendStickerRequest request);
    //
    // StickerSet getStickerSet(GetStickerSetRequest request);
    //
    // File uploadStickerFile(UploadStickerFileRequest request);
    //
    // Boolean createNewStickerSet(CreateNewStickerSetRequest request);
    //
    // Boolean addStickerToSet(AddStickerToSetRequest request);
    //
    // Boolean setStickerPositionInSet(SetStickerPositionInSetRequest request);
    //
    // Boolean deleteStickerFromSet(DeleteStickerFromSetRequest request);
    //
    // // INLINE
    //
    // Boolean answerInlineQuery(AnswerInlineQueryRequest request);
    //
    // // PAYMENTS
    //
    // Message sendInvoice(SendInvoiceRequest request);
    //
    // Boolean answerShippingQuery(AnswerShippingQueryRequest request);
    //
    // Boolean answerPreCheckoutQuery(AnswerPreCheckoutQueryRequest request);
    //
    // // PASSPORT
    //
    // Boolean setPassportDataErrors(SetPassportDataErrorsRequest request);
    //
    // // GAMES
    //
    // Message sendGame(SendGameRequest request);
    //
    // Message setGameScore(SetGameScoreRequest request);

}
