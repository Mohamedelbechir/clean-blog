package com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cin;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
}
