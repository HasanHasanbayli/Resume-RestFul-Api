package com.example.ResumeRestApi.services.interfaces;

import javassist.NotFoundException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface SliderService {

    void store(MultipartFile file) throws IOException;

    void getById(Long id) throws IOException, NotFoundException;

    void deleteById(Long id) throws IOException, NotFoundException;

}
