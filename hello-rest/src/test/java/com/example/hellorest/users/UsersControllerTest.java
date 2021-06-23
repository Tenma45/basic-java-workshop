package com.example.hellorest.users;

import com.example.hellorest.users.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UsersControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getUsersTest() {
        UserModel[] result = restTemplate.getForObject("/users",UserModel[].class);
        assertEquals(5, result.length);
    }
}