package com.example.ResumeRestApi.models.DTOs;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {

    @Size(max = 30, message = "Username should be less than 30 characters")
    @NotBlank(message = "Username must not be null or empty")
    String username;

    @Size(max = 30, message = "Email should be less than 30 characters")
    @Email(message = "Email is not valid")
    @NotBlank(message = "Email must not be null or empty")
    String email;

    @Size(max = 15, min = 6, message = "Password should be less than 15 characters and bigger than 6 charters")
    @NotBlank(message = "Password must not be null or empty")
    String password;

    @Size(max = 15, min = 6, message = "Password repeat should be less than 15 characters and bigger than 6 charters")
    @NotBlank(message = "Password repeat must not be null or empty")
    String password_repeat;
}
