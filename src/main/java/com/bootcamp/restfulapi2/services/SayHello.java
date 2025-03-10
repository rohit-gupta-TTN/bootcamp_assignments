package com.bootcamp.restfulapi2.services;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class SayHello {
    private MessageSource messageSource;
    public SayHello(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getHello() {
        Locale locale = LocaleContextHolder.getLocale();
        String greeting = messageSource.getMessage("hellomessage", null, locale);
        return greeting;
    }
}
