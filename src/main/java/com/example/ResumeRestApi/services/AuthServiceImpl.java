package com.example.ResumeRestApi.services;

import com.example.ResumeRestApi.models.DTOs.LoginDTO;
import com.example.ResumeRestApi.models.DTOs.RegisterDTO;
import com.example.ResumeRestApi.models.DTOs.TokenDTO;
import com.example.ResumeRestApi.repositories.UserRepository;
import com.example.ResumeRestApi.services.interfaces.AuthService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;

@Service
@Slf4j
public class AuthServiceImpl implements AuthService {
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public HttpStatus registration(RegisterDTO registerDTO, String url) throws MessagingException, IOException {
        boolean userExists = userRepository.findByEmail(registerDTO.getEmail()).isPresent();
        if (userExists) {
            throw new IllegalStateException("email already taken");
        }
        String encodedPassword = bCryptPasswordEncoder.encode(registerDTO.getPassword());
        registerDTO.setPassword(encodedPassword);
        return null;
    }

    @Override
    public TokenDTO login(LoginDTO loginDTO) throws JsonProcessingException {
        return null;
    }

}
