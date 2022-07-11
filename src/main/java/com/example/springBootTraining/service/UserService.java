package com.example.springBootTraining.service;


import com.example.springBootTraining.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
    User getUserById(int id);
    List<User> getAllUsers();
}
