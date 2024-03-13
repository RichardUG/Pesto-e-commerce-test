package com.pesto.ecommerce.persistence.impl;

import com.pesto.ecommerce.persistence.AuthPersistence;
import org.springframework.stereotype.Service;

@Service
public class AuthImpl implements AuthPersistence {

    @Override
    public String findRoleByUsername(String username) {
        // Simulate fetching role from database
        if ("user".equals(username)) {
            return "ROLE_USER";
        } else {
            return null;
        }
    }
}
