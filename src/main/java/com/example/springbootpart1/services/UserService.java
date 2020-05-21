package com.example.springbootpart1.services;

import com.example.springbootpart1.model.User;

public interface UserService {

    String addUser(long id, String name, String surname);

    String getUser(long id);

    String removeUser(long id);

}
