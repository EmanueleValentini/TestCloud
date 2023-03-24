package it.ripasso.management.service;

import it.ripasso.management.dto.UserDto;
import it.ripasso.management.model.User;

import java.util.Optional;

public interface UserService {

    User save(User user);

    Optional<User> findById(Long id);

}
