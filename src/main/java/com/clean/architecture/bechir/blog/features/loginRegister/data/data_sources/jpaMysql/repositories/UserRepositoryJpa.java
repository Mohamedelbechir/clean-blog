package com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.repositories;

import java.util.Optional;

import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities.UserJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepositoryJpa extends JpaRepository<UserJpa, Long> {

   public Optional<UserJpa> findByCin(Long cin);


}
