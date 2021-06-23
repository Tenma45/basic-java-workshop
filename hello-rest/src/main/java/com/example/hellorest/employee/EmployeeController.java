package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private CustomRandom random;

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/employee/{id}")
    public Employee getEmployeeByID(@PathVariable String id) {
        // Validate id => Number only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e) {
            // ERROR => TODO ?
        }
        // Workshop
        Employee data = new Employee("Worapat","Tubtimdee");
        repository.save(data);
        Employee result = repository.getById(_id);
        return result;
    }

    // employee?id2==?
    @GetMapping("/employee")
    public Employee getEmployeeByID2(@RequestParam String id) {
        // Validate id => Number only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e) {
            // ERROR => TODO ?
        }
        Employee data = new Employee("Worapat","Tubtimdee");
        repository.save(data);
        Employee result = repository.getById(_id);
        return result;
    }

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest request) {
        // Validation
        return new EmployeeResponse(999, request.getFname(), request.getLname());
    }
}