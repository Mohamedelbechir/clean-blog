package com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.register;

import com.clean.architecture.bechir.blog.core.annotations.UseCase;
import com.clean.architecture.bechir.blog.core.useCase.UseCaseInteractor;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.Compte;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.User;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.repositories.CompteRepository;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.repositories.UserRepository;

@UseCase
public class RegisterUseCase implements UseCaseInteractor<RegisterRequest, RegisterResponse> {

    private final UserRepository userRepository;
    private final CompteRepository compteRepository;

    public RegisterUseCase(UserRepository userRepository, CompteRepository compteRepository) {
        this.userRepository = userRepository;
        this.compteRepository = compteRepository;
    }

    @Override
    public RegisterResponse execute(RegisterRequest params) {

        try {
            User addedUser = userRepository.add(params.user);
            Compte compteToAdd = Compte.builder().login(params.login).password(params.password).user(addedUser).build();
            compteRepository.add(compteToAdd);
            return new RegisterResponse(compteToAdd.getLogin());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

}
