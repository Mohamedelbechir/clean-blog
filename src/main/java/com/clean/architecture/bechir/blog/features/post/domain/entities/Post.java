package com.clean.architecture.bechir.blog.features.post.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
    private Long id;
    private String texte;
}
