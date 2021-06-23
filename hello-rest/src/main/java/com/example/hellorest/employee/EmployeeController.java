package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private CustomRandom random;

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private EmployeeService emlpoyeeService;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id) {
        // Validate id => Number only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e) {
            // ERROR => TODO ?
        }

        EmployeeResponse employeeResponse = emlpoyeeService.process(_id);
        return employeeResponse;
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
        EmployeeResponse response = new EmployeeResponse(_id,"Somkiat","Pui");
        return response;
    }

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest request) {
        // Validation
        EmployeeResponse response = new EmployeeResponse(999,request.getFname(),request.getLname());
        return response;
    }
}