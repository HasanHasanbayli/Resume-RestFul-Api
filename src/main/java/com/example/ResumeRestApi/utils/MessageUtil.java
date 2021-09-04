package com.example.ResumeRestApi.utils;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MessageUtil {
    public String getUrl(HttpServletRequest request) {
        return request.getRequestURL()
                .substring(0, request.getRequestURL().length() - request.getRequestURI().length())
                + request.getContextPath();
    }
}
