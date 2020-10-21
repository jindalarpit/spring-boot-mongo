package com.learning.springbootmongo.controller;

import com.learning.springbootmongo.entity.User;
import com.learning.springbootmongo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/users")
public class UserController {

    private UserRepository userRepository;
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping()
    public @ResponseBody
    User addUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping()
    public @ResponseBody
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
