package com.example.ResumeRestApi.repository;

import com.example.ResumeRestApi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
