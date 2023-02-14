package com.example.devpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import java.lang.String;
import java.util.logging.Logger;

@Controller
public class ExceptionHandlerController {

    private static final Logger LOG = Logger.getLogger(String.valueOf(ExceptionHandlerController.class));

    @ExceptionHandler(RestException.class)
    public @ResponseBody
    String handleException(RestException e) {
        LOG.exiting("Ошибка: " + e.getMessage(), String.valueOf(e));
        return "Ошибка: " + e.getMessage();
    }
}