package com.example.springbootpart1.repository;

import com.example.springbootpart1.model.User;

public interface FakeRepoInterface {

    User insertUser(long id, String name, String surname);

    User findUserById(long id);

    User deleteUser(long id);
}
