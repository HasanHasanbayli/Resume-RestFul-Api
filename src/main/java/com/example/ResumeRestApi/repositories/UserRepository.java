package com.example.ResumeRestApi.repositories;

import com.example.ResumeRestApi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUsername(String username);

    Optional<User> findByEmail(String email);

}
