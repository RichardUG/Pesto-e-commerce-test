package com.pesto.ecommerce.service;

import com.pesto.ecommerce.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private Map<Long, User> users = new HashMap<>();
    private long idCounter = 0;

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User getUserById(Long id) {
        return users.get(id);
    }

    public void addUser(User user) {
        user.setId(++idCounter);
        users.put(user.getId(), user);
    }

    public void updateUser(User user) {
        users.put(user.getId(), user);
    }

    public void deleteUser(Long id) {
        users.remove(id);
    }
}