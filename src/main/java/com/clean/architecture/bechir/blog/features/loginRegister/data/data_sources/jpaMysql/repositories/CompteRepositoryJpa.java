package com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.repositories;

import java.util.Optional;

import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities.CompteJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepositoryJpa extends JpaRepository<CompteJpa, Long> {
    Optional<CompteJpa> findByLoginAndPassword(String login, String password);

}
