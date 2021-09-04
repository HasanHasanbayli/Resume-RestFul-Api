package com.example.ResumeRestApi.services.interfaces;

import com.example.ResumeRestApi.models.User;

public interface UserService {
    User findUserByEmail(String email);

    User save(User user);

    User activeAndSave(User user);
}
