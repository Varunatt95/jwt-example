package com.jwt.example.Service;

import com.jwt.example.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User(UUID.randomUUID().toString(), "Varun", "varun@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "Kapil", "kapil@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "Neha", "neha@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "Lalita", "lalita@gmail.com"));
    }

    public List<User> getUserList(){
        return userList;
    }
}
