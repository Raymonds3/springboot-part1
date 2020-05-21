package com.example.springbootpart1.services;

import com.example.springbootpart1.model.User;
import com.example.springbootpart1.repository.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.springbootpart1.repository.FakeRepo.users;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private FakeRepo fakeRepo;

    public String addUser(long id, String name, String surname) {
        User user = fakeRepo.insertUser(id, name, surname);
        return String.format("%s %s was Entered",
                user.getName(), user.getSurname());
    }

    public String getUser(long id) {
        User user = fakeRepo.findUserById(id);
        return String.format("Hello %s %s",
                user.getName(), user.getSurname());
    }

    public String removeUser(long id) {
        User user = fakeRepo.deleteUser(id);
        return String.format("%s %s was Deleted",
                user.getName(), user.getSurname());
    }
}
