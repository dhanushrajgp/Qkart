package com.example.Qkart.controller;
import com.example.Qkart.dto.UsersResponse;
import com.example.Qkart.entities.User;
import com.example.Qkart.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/all")
    public @ResponseBody UsersResponse getAllUsers() {
        // This returns a JSON or XML with the users
        return new UsersResponse(userRepository.findAll());
    }
}