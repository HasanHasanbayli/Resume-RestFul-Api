package com.example.ResumeRestApi.repositories;

import com.example.ResumeRestApi.models.Slider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface SliderRepository extends JpaRepository<Slider, Long> {
}
