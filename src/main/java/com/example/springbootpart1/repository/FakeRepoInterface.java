package com.example.springbootpart1.repository;

import com.example.springbootpart1.model.User;

import java.util.Collection;

public interface FakeRepoInterface {

    Collection<User> getAllUsers();

    User getAllById(int id);

    void insertUser(User user);

    void findUserById(int id);

    void deleteUser(int id);
}
