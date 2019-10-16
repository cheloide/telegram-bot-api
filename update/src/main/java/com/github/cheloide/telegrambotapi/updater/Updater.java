package com.github.cheloide.telegrambotapi.updater;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.cheloide.telegrambotapi.model.api.Response;
import com.github.cheloide.telegrambotapi.model.common.Update;
import com.github.cheloide.telegrambotapi.service.TelegramHttpRequestService;

class Updater implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Updater.class);

    private TelegramHttpRequestService httpRequestService;
    private ObjectMapper               mapper;
    private Queue<Update>              queue;
    private long                       offset;
    private Lock                       lock;

    public Updater(TelegramHttpRequestService httpRequestService, Queue<Update> queue, Lock lock) {
        super();
        this.httpRequestService = httpRequestService;
        this.mapper = new ObjectMapper();
        this.mapper.setDefaultPropertyInclusion(Include.NON_EMPTY);
        this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.queue = queue;
        this.lock = lock;
    }

    public void run() {
        LOGGER.debug("Starting Update");
        try {
            String method = String.format("getUpdates?offset=%d&timeout=%d", offset, 9000);
            String json   = httpRequestService.get(method);
            LOGGER.debug("method {} returned {}", method, json);

            if (json != null) {
                Response<List<Update>> response = mapper.readValue(json, new TypeReference<Response<List<Update>>>() {
                });
                if (Boolean.TRUE.equals(response.getOk()) && response.getResult() != null && !response.getResult().isEmpty()) {
                    updateOffset(response.getResult());
                    lock.lock();
                    try {
                        queue.addAll(response.getResult());
                    } finally {
                        lock.unlock();
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("Gettings updates Failed", e);
        }
    }

    private void updateOffset(List<Update> ulist) {
        this.offset = ulist.stream().mapToLong(Update::getUpdateId).max().orElse(offset) + 1;
    }
}
