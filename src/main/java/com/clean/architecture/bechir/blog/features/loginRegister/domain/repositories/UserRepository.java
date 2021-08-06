
package com.clean.architecture.bechir.blog.features.loginRegister.domain.repositories;

import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.User;

public interface UserRepository {

    public User add(User user);

}