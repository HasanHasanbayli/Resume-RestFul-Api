package com.example.ResumeRestApi.repository;

import com.example.ResumeRestApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUsername(String username);

    Optional<User> findByEmail(String email);

    List<User> getAllActive();

    User findByUsername(String username);
}
