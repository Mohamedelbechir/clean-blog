package com.clean.architecture.bechir.blog.api.loginRegister;

import com.clean.architecture.bechir.blog.api.loginRegister.dtos.LoginInputDto;
import com.clean.architecture.bechir.blog.api.loginRegister.dtos.RegisterInputDto;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.login.LoginRequest;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.login.LoginResponse;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.login.LoginUseCase;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.register.RegisterRequest;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.register.RegisterResponse;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.register.RegisterUseCase;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginUseCase loginUseCase;

    @Autowired
    RegisterUseCase registerUseCase;

    @PostMapping(value = "/login")
    public ResponseEntity<String> login(@RequestBody final LoginInputDto loginInputDto) {
        LoginRequest request = new LoginRequest(loginInputDto.getLogin(), loginInputDto.getPassword());
        LoginResponse response = loginUseCase.execute(request);
        return new ResponseEntity<String>(response.token, HttpStatus.OK);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<String> register(@RequestBody final RegisterInputDto registerInputDto) {
        User user = User.builder().cin(registerInputDto.getCin()).nom(registerInputDto.getNom())
                .prenom(registerInputDto.getPrenom()).dateNaissance(registerInputDto.getDateNaissance()).build();
        RegisterRequest request = new RegisterRequest(user, registerInputDto.getLogin(),
                registerInputDto.getPassword());

        RegisterResponse response = registerUseCase.execute(request);
        return new ResponseEntity<String>(response.token, HttpStatus.OK);
    }

}
