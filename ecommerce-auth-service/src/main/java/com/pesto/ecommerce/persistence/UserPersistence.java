package com.pesto.ecommerce.persistence;

import com.pesto.ecommerce.model.User;

import java.util.List;

public interface UserPersistence {
    List<User> getAllUsers();

    User getUserById(Long id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
