package com.github.cheloide.telegrambotapi.updater;

import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.cheloide.telegrambotapi.model.common.Update;
import com.github.cheloide.telegrambotapi.service.TelegramBotApiUpdateService;
import com.github.cheloide.telegrambotapi.service.TelegramHttpRequestService;

public class TelegramBotApiUpdateServiceImpl implements TelegramBotApiUpdateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TelegramBotApiUpdateServiceImpl.class);

    private ObjectMapper             mapper;
    private Queue<Update>            updatesQueue;
    private Runnable                 updater;
    private ScheduledExecutorService executor;
    private long                     pollingInterval;
    private Lock                     lock;

    private TelegramBotApiUpdateServiceImpl() {
        this.mapper = new ObjectMapper();
        this.mapper.setDefaultPropertyInclusion(Include.NON_EMPTY);
        this.updatesQueue = new LinkedBlockingQueue<>();
    }

    public TelegramBotApiUpdateServiceImpl(TelegramHttpRequestService httpRequestService, long pollingInterval) {
        this();
        this.lock = new ReentrantLock();
        updater = new Updater(httpRequestService, updatesQueue, lock);
        executor = Executors.newScheduledThreadPool(1);
        this.pollingInterval = pollingInterval;
    }

    public TelegramBotApiUpdateServiceImpl(TelegramHttpRequestService httpRequestService) {
        this(httpRequestService, 5000);
    }

    @Override
    public void startUpdates() {
        LOGGER.info("Starting updates with {}ms of delay between executions", pollingInterval);
        executor.scheduleAtFixedRate(updater, 0, pollingInterval, TimeUnit.MILLISECONDS);
    }

    @Override
    public void stopUpdates() {
        LOGGER.info("Starting shutdown of executor");
        executor.shutdown();
    }

    public Update poll() {
        LOGGER.info("Polling");
        Update update = null;
        if (lock.tryLock()) {
            try {
                update = updatesQueue.poll();
            } finally {
                lock.unlock();
            }
        }
        return update;
    }

    @Override
    public void flushUpdates() {
        updatesQueue.clear();
    }
}
