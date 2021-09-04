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
public class LoginDTO {
    @Email(message = "Email is not valid")
    @NotBlank(message = "Email must not be null or empty")
    String email;
    @Size(max = 15, min = 6, message = "Password should be less than 15 characters and bigger than 6 charters")
    @NotBlank(message = "Password must not be null or empty")
    String password;
}
