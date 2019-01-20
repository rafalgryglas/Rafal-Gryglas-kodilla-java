package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherProcessOrder {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherProcessOrder.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("Logger: execution of the ordering process");
    }
}
