package com.clean.architecture.bechir.blog.features.loginRegister.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Compte {
    private Long id;
    private String login;
    private String password;
    private User user;

}
