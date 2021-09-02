package com.example.ResumeRestApi.dto;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;

public class UserDTO {
    @NotNull
    @NotEmpty
    private String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;

    @NotNull
    @NotEmpty
    private String email;
}
