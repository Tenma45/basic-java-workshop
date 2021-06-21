package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id) {
        // Validate id => Number only

        int _id;
        try {
            _id = Integer.parseInt(id);
        }
        catch (NumberFormatException e){
            _id = 0;
        }
        return new EmployeeResponse(_id, "Somkiat", "Pui");
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByID2(@RequestParam String id) {
        // Validate id => Number only

        int _id;
        try {
            _id = Integer.parseInt(id);
        }
        catch (NumberFormatException e){
            _id = 0;
        }
        return new EmployeeResponse(_id, "Somkiat", "Pui");
    }

}
