package com.example.resume.resumebuilder.controllers;

import com.example.resume.resumebuilder.entities.User;
import com.example.resume.resumebuilder.repositories.UserRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List findItems() {
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
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
