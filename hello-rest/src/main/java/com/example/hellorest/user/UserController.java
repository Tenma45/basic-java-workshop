package com.example.hellorest.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class UserController {

    private List<UserResponse> users = new ArrayList<>(asList(
            new UserResponse(1,"Worapat","tenma45","Worapat.t@kbtg.tech",
                    new Address("Si Phraya Rd.","18/48","Bangkok","10500",new Geo("13.73","100.53")),
                    "09581583xx","me.com",new Company("KBTG","Technology Banking","Develop Banking Application")),
            new UserResponse(2,"Col.Sander","Kentucky","fried.chicken@kfc.com",
                    new Address("Rail Road St.","KY 160","Kentucky","40823",new Geo("36.97","-82.99")),
                    "1150","kfc.com",new Company("KFC","The Best Fried Chicken","Create Secret Recipe"))
    )
    );

    @GetMapping("/users")
    public List<UserResponse> getUsers(){
        return users;
    }

    @GetMapping("/users/{id}")
    public UserResponse getUserByID(@PathVariable String id){
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e) {
            // ERROR => TODO ?
        }
        int finalId = _id;
        return users.stream().filter(user ->  finalId == user.getId()).findFirst().orElse(null);
    }
}
