package com.example.hellorest.user;

import com.example.hellorest.employee.EmployeeResponse;
import org.h2.engine.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class UserResponseControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getUsersByID() {
        UserResponse expected = new UserResponse(1,"Worapat","tenma45","Worapat.t@kbtg.tech",
                    new Address("Si Phraya Rd.","18/48","Bangkok","10500",new Geo("13.73","100.53")),
                    "09581583xx","me.com",new Company("KBTG","Technology Banking","Develop Banking Application"));
        UserResponse response
                = restTemplate.getForObject("/users/1", UserResponse.class);
//        assertEquals(expected, response); // Pass ?
    }

}