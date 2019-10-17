package com.github.cheloide.telegrambotapi.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.cheloide.telegrambotapi.builder.SendMessageBuilder;
import com.github.cheloide.telegrambotapi.domain.AddStickerToSetRequest;
import com.github.cheloide.telegrambotapi.domain.AnswerCallbackQueryRequest;
import com.github.cheloide.telegrambotapi.domain.AnswerInlineQueryRequest;
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
import com.github.cheloide.telegrambotapi.domain.SetStickerPositionInSetRequest;
import com.github.cheloide.telegrambotapi.domain.StopMessageLiveLocationRequest;
import com.github.cheloide.telegrambotapi.domain.UnbanChatMemberRequest;
import com.github.cheloide.telegrambotapi.domain.UnpinChatMessageRequest;
import com.github.cheloide.telegrambotapi.domain.UploadStickerFileRequest;
import com.github.cheloide.telegrambotapi.model.api.Response;
import com.github.cheloide.telegrambotapi.model.common.Chat;
import com.github.cheloide.telegrambotapi.model.common.ChatMember;
import com.github.cheloide.telegrambotapi.model.common.File;
import com.github.cheloide.telegrambotapi.model.common.Message;
import com.github.cheloide.telegrambotapi.model.common.User;
import com.github.cheloide.telegrambotapi.model.common.UserProfilePhotos;
import com.github.cheloide.telegrambotapi.model.sticker.StickerSet;
import com.github.cheloide.telegrambotapi.service.TelegramBotApiService;
import com.github.cheloide.telegrambotapi.service.TelegramHttpRequestService;

public class TelegramBotApiServiceImpl implements TelegramBotApiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TelegramBotApiServiceImpl.class);

    private ObjectMapper               mapper;
    private TelegramHttpRequestService httpRequestService;

    private TelegramBotApiServiceImpl() {
        this.mapper = new ObjectMapper();
        this.mapper.setDefaultPropertyInclusion(Include.NON_EMPTY);
    }

    public TelegramBotApiServiceImpl(TelegramHttpRequestService httpRequestService) {
        this();
        this.httpRequestService = httpRequestService;
    }

    public Response<User> getMe() {
        String         jsonResponse;
        Response<User> response = null;
        try {

            jsonResponse = httpRequestService.get("getMe");
            response = mapper.readValue(jsonResponse, new TypeReference<Response<User>>() {
            });

        } catch (Exception e) {
            LOGGER.debug("Error getMe: ", e);
        }
        return response;
    }

    public Response<Message> sendMessage(SendMessageRequest request) {
        return null;
    }

    public Response<Message> sendMessage(long chatId, String text) {
        String payload;
        try {
            payload = mapper.writeValueAsString(SendMessageBuilder.getBuilder().setChatId(chatId).setText(text).build());
            httpRequestService.postJson("sendMessage", payload);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }

    public Response<Message> sendMessage(long chatId, String text, String parseMode, Boolean disableWebPagePreview, Boolean disableNotification, Integer replyToMessageId) {
        String payload;
        try {
            payload = mapper.writeValueAsString(SendMessageBuilder.getBuilder().setChatId(chatId).build());
            httpRequestService.postJson("sendMessage", payload);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public Response<Message> forwardMessage(ForwardMessageRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> sendPhoto(SendPhotoRequest request) {
        String payload;
        String response;
        try {
            payload = mapper.writeValueAsString(request);
            response = httpRequestService.postJson("sendPhoto", payload);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public Response<Message> sendAudio(SendAudioRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> sendDocument(SendDocumentRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> sendVideo(SendVideoRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> sendAnimation(SendAnimationRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> sendVoice(SendVoiceRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> sendVideoNote(SendVideoNoteRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<List<Message>> sendMediaGroup(SendMediaGroupRequest request) {
        Response<List<Message>> response = null;
        try {
            String payload      = mapper.writeValueAsString(request);
//            LOGGER.debug("Sending );
            String jsonResponse = httpRequestService.postJson("sendMediaGroup", payload);
            response = mapper.readValue(jsonResponse, new TypeReference<Response<List<Message>>>() {
            });
        } catch (Exception e) {
            LOGGER.error("Error calling method sendMediaGroup", e);
        }
        return response;
    }

    public Response<Message> sendLocation(SendLocationRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> editMessageLiveLocation(EditMessageLiveLocationRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> stopMessageLiveLocation(StopMessageLiveLocationRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> sendVenue(SendVenueRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> sendContact(SendContactRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> sendChatAction(SendChatActionRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<UserProfilePhotos> getUserProfilePhotos(GetUserProfilePhotosRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<File> getFile(GetFileRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> kickChatMember(KickChatMemberRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> unbanChatMember(UnbanChatMemberRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> restrictChatMember(RestrictChatMemberRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> promoteChatMember(PromoteChatMemberRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<String> exportChatInviteLink(ExportChatInviteLinkRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> setChatPhoto(SetChatPhotoRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> deleteChatPhoto(DeleteChatPhotoRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> setChatTitle(SetChatTitleRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> setChatDescription(SetChatDescriptionRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> pinChatMessage(PinChatMessageRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> unpinChatMessage(UnpinChatMessageRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> leaveChat(LeaveChatRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Chat> getChat(GetChatRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<List<ChatMember>> getChatAdministrators(GetChatAdministratorsRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Integer> getChatMembersCount(GetChatMembersCountRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<ChatMember> getChatMember(GetChatMemberRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> setChatStickerSet(SetChatStickerSetRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> deleteChatStickerSet(DeleteChatStickerSetRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> answerCallbackQuery(AnswerCallbackQueryRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> editMessageText(EditMessageTextRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> editMessageCaption(EditMessageCaptionRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> editMessageMedia(EditMessageMediaRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> editMessageReplyMarkup(EditMessageReplyMarkupRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> deleteMessage(DeleteMessageRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Message> sendSticker(SendStickerRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<StickerSet> getStickerSet(GetStickerSetRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<File> uploadStickerFile(UploadStickerFileRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> createNewStickerSet(CreateNewStickerSetRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> addStickerToSet(AddStickerToSetRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> setStickerPositionInSet(SetStickerPositionInSetRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> deleteStickerFromSet(DeleteStickerFromSetRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    public Response<Boolean> answerInlineQuery(AnswerInlineQueryRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

}
