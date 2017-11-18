package com.example.resume.resumebuilder.controllers;

import com.example.resume.resumebuilder.entities.User;
import com.example.resume.resumebuilder.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;

	@Autowired
	public UserController(UserRepository userRepository) {this.userRepository = userRepository;}

	@GetMapping(value = "/users")
    public List findItems() {
        return userRepository.findAll();
    }

    @PostMapping(value = "/users")
    public void save(@Valid @RequestBody User user) {
        userRepository.save(user);

        Optional<User> savedUser = userRepository.findById(user.getId());
        if (savedUser.isPresent()) {
            System.out.println("Saved User ====> "+savedUser.get());
        } else {
            System.out.println("User not found=====> ");
        }
    }
}
