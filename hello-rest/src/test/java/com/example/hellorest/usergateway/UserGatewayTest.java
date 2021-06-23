package com.example.hellorest.usergateway;

import org.h2.engine.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserGatewayTest {

    @Autowired
    private UserGateway userGateway;

    @Test
    public void tryToCallAPI() {
        List<UserModel> users = userGateway.getAllUsers();
        assertEquals(10,users.size());
    }

    @Test
    public void tryToCallAPIByID() {
        UserModel user = userGateway.getUserById(1);
        assertEquals(1,user.getId());
        assertEquals("Leanne Graham",user.getName());
    }

    @Test
    public void tryToCallAPIWithCondition() {
        List<UserModel> users = userGateway.getEvenUsers();
        assertEquals(5,users.size());
    }
}