package com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompteJpa {
    @Id
    private Long id;
    private String login;
    private String password;
    private Long cinUser;

}
