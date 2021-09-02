package com.example.ResumeRestApi.controller;

import com.example.ResumeRestApi.model.User;
import com.example.ResumeRestApi.service.CustomUserServiceDetail;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/registration")
@AllArgsConstructor
public class UserController {
    private CustomUserServiceDetail userServiceDetail;

    @PostMapping
    public String register(@RequestBody User user) {
        return userServiceDetail.signUpUser(user);
    }
}