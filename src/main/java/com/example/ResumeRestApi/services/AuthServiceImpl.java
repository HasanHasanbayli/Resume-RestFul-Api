package com.example.ResumeRestApi.services;

import com.example.ResumeRestApi.models.DTOs.LoginDTO;
import com.example.ResumeRestApi.models.DTOs.RegisterDTO;
import com.example.ResumeRestApi.models.DTOs.TokenDTO;
import com.example.ResumeRestApi.repositories.UserRepository;
import com.example.ResumeRestApi.services.interfaces.AuthService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;

@Service
@Slf4j
public class AuthServiceImpl implements AuthService {
    private UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public HttpStatus registration(RegisterDTO registerDTO, String url) throws MessagingException, IOException {
        return null;
    }

    @Override
    public TokenDTO login(LoginDTO loginDTO) throws JsonProcessingException {
        return null;
    }
}
