package com.example.ResumeRestApi.services.interfaces;

import com.example.ResumeRestApi.models.DTOs.LoginDTO;
import com.example.ResumeRestApi.models.DTOs.RegisterDTO;
import com.example.ResumeRestApi.models.DTOs.TokenDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;

import javax.mail.MessagingException;
import java.io.IOException;

public interface AuthService {
    HttpStatus registration(RegisterDTO registerDTO, String url) throws MessagingException, IOException;

    TokenDTO login(LoginDTO loginDTO) throws JsonProcessingException;
}
