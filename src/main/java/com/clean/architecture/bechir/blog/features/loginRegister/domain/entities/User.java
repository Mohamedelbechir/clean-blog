package com.clean.architecture.bechir.blog.features.loginRegister.domain.entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long cin;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

}
