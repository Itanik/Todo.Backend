package me.itanik.todo.backend.controllers;

import me.itanik.todo.backend.model.entity.UserEntity;
import me.itanik.todo.backend.model.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public Iterable<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    @PutMapping("/user")
    public Iterable<UserEntity> putUser(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email) {
        UserEntity newUser = new UserEntity();
        newUser.setName(name);
        newUser.setEmail(email);
        userRepository.save(newUser);
        return userRepository.findAll();
    }
}
