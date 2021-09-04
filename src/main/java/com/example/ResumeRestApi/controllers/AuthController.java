package com.example.ResumeRestApi.controllers;

import com.example.ResumeRestApi.models.DTOs.LoginDTO;
import com.example.ResumeRestApi.models.DTOs.RegisterDTO;
import com.example.ResumeRestApi.models.DTOs.TokenDTO;
import com.example.ResumeRestApi.services.interfaces.AuthService;
import com.example.ResumeRestApi.utils.MessageUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping("api/auth")
@Slf4j
public class AuthController {
    private final AuthService authService;
    private final MessageUtil messageUtil;

    public AuthController(MessageUtil messageUtil, AuthService authService) {
        this.messageUtil = messageUtil;
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<HttpStatus> register(@Valid @RequestBody RegisterDTO registerDTO,
                                               HttpServletRequest request) throws MessagingException, IOException {
        log.info("User {} is registering", registerDTO.getUsername());
        return new ResponseEntity<>(
                authService.registration(registerDTO, messageUtil.getUrl(request))
        );
    }

    @PostMapping(path = "/login")
    public ResponseEntity<TokenDTO> login(@Valid @RequestBody LoginDTO loginDTO) throws JsonProcessingException {
        log.info("User with email {} is joining", loginDTO.getEmail());
        return ResponseEntity.ok(authService.login(loginDTO));
    }
}
