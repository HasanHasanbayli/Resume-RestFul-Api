package com.example.ResumeRestApi.controller;

import com.example.ResumeRestApi.model.User;
import com.example.ResumeRestApi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        User user2=new User();
        user2.getUsername()=user.setUsername(user);
    }

    @GetMapping("/all")
    public String allUser() {
        return "all user";
    }
}