package com.example.springbootpart1.services;

import com.example.springbootpart1.model.User;
import com.example.springbootpart1.repository.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private FakeRepoInterface fakeRepoInterface;

    public void addUser(User user) {
        fakeRepoInterface.insertUser(user);
    }

    public void getUser(int id) {
        fakeRepoInterface.findUserById(id);
    }

    public void removeUser(int id) {
        fakeRepoInterface.deleteUser(id);
    }
}
