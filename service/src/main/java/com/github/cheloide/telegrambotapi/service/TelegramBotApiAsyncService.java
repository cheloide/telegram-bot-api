package com.github.cheloide.telegrambotapi.service;

import java.util.List;
import java.util.concurrent.Future;

import com.github.cheloide.telegrambotapi.domain.AddStickerToSetRequest;
import com.github.cheloide.telegrambotapi.domain.AnswerCallbackQueryRequest;
import com.github.cheloide.telegrambotapi.domain.AnswerInlineQueryRequest;
import com.github.cheloide.telegrambotapi.domain.AnswerPreCheckoutQueryRequest;
import com.github.cheloide.telegrambotapi.domain.AnswerShippingQueryRequest;
import com.github.cheloide.telegrambotapi.domain.CreateNewStickerSetRequest;
import com.github.cheloide.telegrambotapi.domain.DeleteChatPhotoRequest;
import com.github.cheloide.telegrambotapi.domain.DeleteChatStickerSetRequest;
import com.github.cheloide.telegrambotapi.domain.DeleteMessageRequest;
import com.github.cheloide.telegrambotapi.domain.DeleteStickerFromSetRequest;
import com.github.cheloide.telegrambotapi.domain.EditMessageCaptionRequest;
import com.github.cheloide.telegrambotapi.domain.EditMessageLiveLocationRequest;
import com.github.cheloide.telegrambotapi.domain.EditMessageMediaRequest;
import com.github.cheloide.telegrambotapi.domain.EditMessageReplyMarkupRequest;
import com.github.cheloide.telegrambotapi.domain.EditMessageTextRequest;
import com.github.cheloide.telegrambotapi.domain.ExportChatInviteLinkRequest;
import com.github.cheloide.telegrambotapi.domain.ForwardMessageRequest;
import com.github.cheloide.telegrambotapi.domain.GetChatAdministratorsRequest;
import com.github.cheloide.telegrambotapi.domain.GetChatMemberRequest;
import com.github.cheloide.telegrambotapi.domain.GetChatMembersCountRequest;
import com.github.cheloide.telegrambotapi.domain.GetChatRequest;
import com.github.cheloide.telegrambotapi.domain.GetFileRequest;
import com.github.cheloide.telegrambotapi.domain.GetStickerSetRequest;
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
import com.github.cheloide.telegrambotapi.domain.SendGameRequest;
import com.github.cheloide.telegrambotapi.domain.SendInvoiceRequest;
import com.github.cheloide.telegrambotapi.domain.SendLocationRequest;
import com.github.cheloide.telegrambotapi.domain.SendMediaGroupRequest;
import com.github.cheloide.telegrambotapi.domain.SendMessageRequest;
import com.github.cheloide.telegrambotapi.domain.SendPhotoRequest;
import com.github.cheloide.telegrambotapi.domain.SendStickerRequest;
import com.github.cheloide.telegrambotapi.domain.SendVenueRequest;
import com.github.cheloide.telegrambotapi.domain.SendVideoNoteRequest;
import com.github.cheloide.telegrambotapi.domain.SendVideoRequest;
import com.github.cheloide.telegrambotapi.domain.SendVoiceRequest;
import com.github.cheloide.telegrambotapi.domain.SetChatDescriptionRequest;
import com.github.cheloide.telegrambotapi.domain.SetChatPhotoRequest;
import com.github.cheloide.telegrambotapi.domain.SetChatStickerSetRequest;
import com.github.cheloide.telegrambotapi.domain.SetChatTitleRequest;
import com.github.cheloide.telegrambotapi.domain.SetGameScoreRequest;
import com.github.cheloide.telegrambotapi.domain.SetPassportDataErrorsRequest;
import com.github.cheloide.telegrambotapi.domain.SetStickerPositionInSetRequest;
import com.github.cheloide.telegrambotapi.domain.StopMessageLiveLocationRequest;
import com.github.cheloide.telegrambotapi.domain.UnbanChatMemberRequest;
import com.github.cheloide.telegrambotapi.domain.UnpinChatMessageRequest;
import com.github.cheloide.telegrambotapi.domain.UploadStickerFileRequest;
import com.github.cheloide.telegrambotapi.model.common.Chat;
import com.github.cheloide.telegrambotapi.model.common.ChatMember;
import com.github.cheloide.telegrambotapi.model.common.File;
import com.github.cheloide.telegrambotapi.model.common.Message;
import com.github.cheloide.telegrambotapi.model.common.User;
import com.github.cheloide.telegrambotapi.model.common.UserProfilePhotos;
import com.github.cheloide.telegrambotapi.model.sticker.StickerSet;

public interface TelegramBotApiAsyncService {

    // GENERAL API

    /**
     * A simple method for testing your bot's auth token. Requires no parameters.
     * Returns basic information about the bot in form of a User object.
     * 
     * @return
     */
    Future<User> getMe();

    /**
     * Use this method to send text messages. On success, the sent Message is
     * returned.
     * 
     * @param request
     * @return
     */
    Future<Message> sendMessage(SendMessageRequest request);

    /**
     * Use this method to send text messages. On success, the sent Message is
     * returned.
     * 
     * @param chatId Unique identifier for the target chat or username of the target
     *               channel (in the format \@channelusername)
     * @param text   Text of the message to be sent
     * @return
     */
    Future<Future<Message>> sendMessage(long chatId, String text);

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
    Future<Message> sendMessage(long chatId, String text, String parseMode, Boolean disableWebPagePreview, Boolean disableNotification, Integer replyToMessageId);

    Future<Message> forwardMessage(ForwardMessageRequest request);

    Future<Message> sendPhoto(SendPhotoRequest request);

    Future<Message> sendAudio(SendAudioRequest request);

    Future<Message> sendDocument(SendDocumentRequest request);

    Future<Message> sendVideo(SendVideoRequest request);

    Future<Message> sendAnimation(SendAnimationRequest request);

    Future<Message> sendVoice(SendVoiceRequest request);

    Future<Message> sendVideoNote(SendVideoNoteRequest request);

    Future<List<Message>> sendMediaGroup(SendMediaGroupRequest request);

    Future<Message> sendLocation(SendLocationRequest request);

    Future<Message> editMessageLiveLocation(EditMessageLiveLocationRequest request);

    Future<Message> stopMessageLiveLocation(StopMessageLiveLocationRequest request);

    Future<Message> sendVenue(SendVenueRequest request);

    Future<Message> sendContact(SendContactRequest request);

    Future<Boolean> sendChatAction(SendChatActionRequest request);

    Future<UserProfilePhotos> getUserProfilePhotos(GetUserProfilePhotosRequest request);

    Future<File> getFile(GetFileRequest request);

    Future<Boolean> kickChatMember(KickChatMemberRequest request);

    Future<Boolean> unbanChatMember(UnbanChatMemberRequest request);

    Future<Boolean> restrictChatMember(RestrictChatMemberRequest request);

    Future<Boolean> promoteChatMember(PromoteChatMemberRequest request);

    Future<String> exportChatInviteLink(ExportChatInviteLinkRequest request);

    Future<Boolean> setChatPhoto(SetChatPhotoRequest request);

    Future<Boolean> deleteChatPhoto(DeleteChatPhotoRequest request);

    Future<Boolean> setChatTitle(SetChatTitleRequest request);

    Future<Boolean> setChatDescription(SetChatDescriptionRequest request);

    Future<Boolean> pinChatMessage(PinChatMessageRequest request);

    Future<Boolean> unpinChatMessage(UnpinChatMessageRequest request);

    Future<Boolean> leaveChat(LeaveChatRequest request);

    Future<Chat> getChat(GetChatRequest request);

    Future<List<ChatMember>> getChatAdministrators(GetChatAdministratorsRequest request);

    Future<Integer> getChatMembersCount(GetChatMembersCountRequest request);

    Future<ChatMember> getChatMember(GetChatMemberRequest request);

    Future<Boolean> setChatStickerSet(SetChatStickerSetRequest request);

    Future<Boolean> deleteChatStickerSet(DeleteChatStickerSetRequest request);

    Future<Boolean> answerCallbackQuery(AnswerCallbackQueryRequest request);

    // UPDATE

    Future<Message> editMessageText(EditMessageTextRequest request);

    Future<Message> editMessageCaption(EditMessageCaptionRequest request);

    Future<Message> editMessageMedia(EditMessageMediaRequest request);

    Future<Message> editMessageReplyMarkup(EditMessageReplyMarkupRequest request);

    Future<Boolean> deleteMessage(DeleteMessageRequest request);

    // STICKERS

    Future<Message> sendSticker(SendStickerRequest request);

    Future<StickerSet> getStickerSet(GetStickerSetRequest request);

    Future<File> uploadStickerFile(UploadStickerFileRequest request);

    Future<Boolean> createNewStickerSet(CreateNewStickerSetRequest request);

    Future<Boolean> addStickerToSet(AddStickerToSetRequest request);

    Future<Boolean> setStickerPositionInSet(SetStickerPositionInSetRequest request);

    Future<Boolean> deleteStickerFromSet(DeleteStickerFromSetRequest request);

    // INLINE

    Future<Boolean> answerInlineQuery(AnswerInlineQueryRequest request);

    // PAYMENTS

    Future<Message> sendInvoice(SendInvoiceRequest request);

    Future<Boolean> answerShippingQuery(AnswerShippingQueryRequest request);

    Future<Boolean> answerPreCheckoutQuery(AnswerPreCheckoutQueryRequest request);

    // PASSPORT

    Future<Boolean> setPassportDataErrors(SetPassportDataErrorsRequest request);

    // GAMES

    Future<Message> sendGame(SendGameRequest request);

    Future<Message> setGameScore(SetGameScoreRequest request);

}
