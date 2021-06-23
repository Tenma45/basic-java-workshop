package com.example.hellorest.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UsersController {
    @Autowired
    private UserGateway userGateway;

    @GetMapping("/users")
    public List<UserModel> getEvenUser(){
        List<UserModel> result = userGateway.getAllUsers();
        List<UserModel> usersWithFilter =
               result.stream().filter(user->user.getId()%2==0).collect(Collectors.toList());
        return usersWithFilter;
    }
}
