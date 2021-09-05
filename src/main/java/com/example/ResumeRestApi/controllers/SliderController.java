package com.example.ResumeRestApi.controllers;

import com.example.ResumeRestApi.models.Slider;
import com.example.ResumeRestApi.services.SliderServiceImpl;
import com.example.ResumeRestApi.utils.MessageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("api/slider")
@Slf4j
public class SliderController {

    @Autowired
    private SliderServiceImpl sliderService;

    @PostMapping("/upload")
    public ResponseEntity<MessageUtil> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";
        try {
            sliderService.store(file);
            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new MessageUtil(message));
        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageUtil(message));
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<MessageUtil> deleteFile(@PathVariable("id") Long id) {
        String message = "";
        try {
            sliderService.deleteById(id);
            message = "The file deleted successfully: ";
            return ResponseEntity.status(HttpStatus.OK).body(new MessageUtil(message));
        } catch (Exception e) {
            message = "The file is not deleted successfully: ";
            return ResponseEntity.noContent().build();
        }
    }
}
