package com.example.springbootpart1.services;

import com.example.springbootpart1.model.User;
import com.example.springbootpart1.repository.FakeRepoInterface;


import java.util.*;

public interface UserService {

    void addUser(long id, String name, String surname);

    void getUser(int id);

    void removeUser(int id);

}
