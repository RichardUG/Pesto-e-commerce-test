package com.pesto.ecommerce.persistence.impl;

import com.pesto.ecommerce.model.User;
import com.pesto.ecommerce.persistence.UserPersistence;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserImpl implements UserPersistence {

    private Map<Long, User> users = new HashMap<>();
    private long idCounter = 0;

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User getUserById(Long id) {
        return users.get(id);
    }

    @Override
    public void addUser(User user) {
        user.setId(++idCounter);
        users.put(user.getId(), user);
    }

    @Override
    public void updateUser(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void deleteUser(Long id) {
        users.remove(id);
    }
}
