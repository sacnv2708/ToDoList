package com.nhom6.backend.aop.logging;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

@Service
public class LogUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogUtils.class);

    public void printLog(String clazz, String method, String actor, long startTime, long endTime) {
        LOGGER.info("{}|{}|{}|{}", clazz, method, actor, startTime);
    }
}
