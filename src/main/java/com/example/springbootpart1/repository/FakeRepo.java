package com.example.springbootpart1.repository;

import com.example.springbootpart1.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FakeRepo implements FakeRepoInterface {
    private static Map<Long, User> user;

    static{
        user = new HashMap<Long, User>() {
            {
                put((long) 1, new User((long) 1, "Raymond","Serekwane"));
                put((long) 2, new User((long) 2, "Thabo","Surname"));
                put((long) 3, new User((long) 3, "Tom","Moyo"));
                put((long) 4, new User((long) 4, "Ryne","Cooper"));
            }
        };
    }

    public Collection<User> getAllUsers(){
        return this.user.values();
    }

    public User getAllById(int id) {
        return this.user.get(id);
    }

    public void insertUser(User user) {
        this.user.put(user.getId(),user);
    }

    public void findUserById(int id) {
        this.user.get(user);
    }

    public void deleteUser(int id) {
        this.user.remove(id);
    }
}
