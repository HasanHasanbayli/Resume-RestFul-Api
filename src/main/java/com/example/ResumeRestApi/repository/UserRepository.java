package com.example.ResumeRestApi.repository;

import com.example.ResumeRestApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
