package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.Random;

@RestController
public class EmployeeController {

    @Autowired
    private CustomRandom random;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id) {
        // Validate id => Number only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e) {
            // ERROR => TODO ?
        }
        // Workshop
        int number = random.nextInt(10);
        return new EmployeeResponse(_id, "Somkiat" + number, "Pui");
    }

    // employee?id2==?
    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByID2(@RequestParam String id) {
        // Validate id => Number only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e) {
            // ERROR => TODO ?
        }
        return new EmployeeResponse(_id, "Somkiat", "Pui");
    }

}