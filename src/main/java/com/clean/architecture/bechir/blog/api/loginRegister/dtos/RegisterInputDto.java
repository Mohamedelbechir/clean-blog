package com.clean.architecture.bechir.blog.api.loginRegister.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class RegisterInputDto {
    @NotBlank
    private String login;
    @NotBlank
    private String password;
    @NotBlank
    private Long cin;
    @NotNull
    private LocalDate dateNaissance;
    @NotBlank
    private String nom;
    @NotBlank
    private String prenom;
}
