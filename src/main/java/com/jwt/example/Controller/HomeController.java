package com.jwt.example.Controller;

import com.jwt.example.Model.User;
import com.jwt.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService userService;

    //http://localhost:9999/home/users
    @GetMapping("/users")
    public List<User> getAllUsers(){
//        System.out.println("getting user...");
        return this.userService.getUserList();
    }
}
