package com.example.springbootpart1.services;

import com.example.springbootpart1.model.User;
import com.example.springbootpart1.repository.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private FakeRepo fakeRepo;

    @Override
    public void addUser(long id, String name, String surname) {
        User usr = fakeRepo.insertUser(id, name, surname);
        String Name = usr.getName() + " " + usr.getSurname()+ " Entered";
        System.out.println("\n"+Name);
    }

    @Override
    public void getUser(int id) {
        User user = fakeRepo.findUserById(id);
        String find = "Hello "+ user.getName()+" "+user.getSurname();
        System.out.println("\n"+find);
    }

    @Override
    public void removeUser(int id) {
        User user = fakeRepo.deleteUser(id);
        String delete = user.getName()+" "+user.getSurname()+" was Deleted";
        System.out.println("\n"+delete);
    }
}
