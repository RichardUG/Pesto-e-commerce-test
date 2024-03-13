package com.pesto.ecommerce.service;

import com.pesto.ecommerce.model.User;
import com.pesto.ecommerce.persistence.AuthPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthPersistence authPersistence;

    public boolean authenticateUser(User user) {
        String validUsername = "user";
        String validPassword = "password";

        return user.getUsername().equals(validUsername) && user.getPassword().equals(validPassword);
    }

    public String getUserRole(String username) {
        return authPersistence.findRoleByUsername(username);
    }
}
