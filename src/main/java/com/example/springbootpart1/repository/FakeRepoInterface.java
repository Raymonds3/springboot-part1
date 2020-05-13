package com.example.springbootpart1.repository;

import com.example.springbootpart1.model.User;

public interface FakeRepoInterface {

    void insertUser(User user);

    void findUserById(int id);

    void deleteUser(int id);
}
