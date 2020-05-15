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

    public User insertUser(long id, String name, String surname) {
        return this.user.put(id, new User(id, name, surname));
    }

    public User findUserById(int id) {
        return this.user.get(id);
    }

    public User deleteUser(int id) {
        return this.user.remove(id);
    }
}
