package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> displayAllUsers();

    void saveUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(User user);
}
