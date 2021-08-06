package com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.login;

import java.util.Optional;

import com.clean.architecture.bechir.blog.core.annotations.UseCase;
import com.clean.architecture.bechir.blog.core.useCase.UseCaseInteractor;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.Compte;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.repositories.CompteRepository;

@UseCase
public class LoginUseCase implements UseCaseInteractor<LoginRequest, LoginResponse> {
    final CompteRepository compteRepository;

    public LoginUseCase(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    @Override
    public LoginResponse execute(LoginRequest params) {

        Optional<Compte> findedCompte = compteRepository.find(params.getLogin(), params.getPassword());
        if (findedCompte.isPresent()) {
            return new LoginResponse(findedCompte.get().getLogin());
        }
        return new LoginResponse();
    }

}
