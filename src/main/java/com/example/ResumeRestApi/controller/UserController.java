package com.example.ResumeRestApi.controller;

import com.example.ResumeRestApi.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/auth")
public class UserController {
    private UserRepository userRepository;

}
