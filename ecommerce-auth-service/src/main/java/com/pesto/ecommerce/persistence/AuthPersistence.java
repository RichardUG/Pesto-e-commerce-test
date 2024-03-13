package com.pesto.ecommerce.persistence;

public interface AuthPersistence {
    String findRoleByUsername(String username);
}
