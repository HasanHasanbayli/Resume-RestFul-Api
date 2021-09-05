package com.example.ResumeRestApi.services;

import com.example.ResumeRestApi.models.Slider;
import com.example.ResumeRestApi.repositories.SliderRepository;
import com.example.ResumeRestApi.services.interfaces.SliderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;



@Service
public class SliderServiceImpl implements SliderService {

    @Autowired
    private SliderRepository sliderRepository;

    @Override
    public void store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Slider slider = new Slider(fileName, file.getContentType(), file.getBytes());
        sliderRepository.save(slider);
    }

    @Override
    public void getById(Long id) {
        sliderRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        Slider slider = sliderRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("this id not found"));
        sliderRepository.delete(slider);
    }
}
