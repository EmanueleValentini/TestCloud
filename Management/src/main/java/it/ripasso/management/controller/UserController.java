package it.ripasso.management.controller;


import it.ripasso.management.dto.UserDto;
import it.ripasso.management.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/user")
public interface UserController {

    @PostMapping()
    ResponseEntity<User> save(@RequestBody UserDto userDto);

    @GetMapping("/{id}")
    ResponseEntity<Optional<User>> findById(@PathVariable("id") Long id);
}
