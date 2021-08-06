package com.clean.architecture.bechir.blog.features.post.data.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities.UserJpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PostJpa {
    @Id
    private Long id; 
    private String texte;
    @ManyToOne
    private UserJpa userJpa;
    
}
