package com.pesto.ecommerce.persistence.impl;

import com.pesto.ecommerce.persistence.AuthPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AuthImpl implements AuthPersistence {

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    @Transactional(readOnly = true)
    public String findRoleByUsername(String username) {
        try {
            return transactionTemplate.execute(status -> {
                // Simulate fetching role from database
                if ("user".equals(username)) {
                    return "ROLE_USER";
                } else {
                    return null;
                }
            });
        } catch (DataAccessException e) {
            // Manejar la excepción de acceso a datos
            e.printStackTrace();
            // Otra lógica de manejo de excepciones si es necesario
            return null;
        }
    }
}
