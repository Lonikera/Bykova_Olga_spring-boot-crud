package com.example.spring_boot_crud.service;

import com.example.spring_boot_crud.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User getUserById(Long id);

    void update(User user);

    void delete(Long id);
}