package com.pesto.ecommerce.controller;

import com.pesto.ecommerce.model.User;
import com.pesto.ecommerce.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/api/login")
    public String login(@RequestBody User user) {
        if (authService.authenticateUser(user)) {
            String role = authService.getUserRole(user.getUsername());
            return "Login successful! Role: " + role;
        } else {
            return "Authentication error.";
        }
    }
}
