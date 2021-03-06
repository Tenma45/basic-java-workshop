package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class EmployeeService {

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setRepository(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Autowired
    private Random random;

    @Autowired
    private EmployeeRepository repository;

    public EmployeeResponse process(int id){
        int number = random.nextInt(10);
        // Workshop
        Optional<Employee> result = repository.findById(id);
        if (result.isPresent()) {
            Employee employee = result.get();
            return new EmployeeResponse(
                    employee.getId(),
                    employee.getFirstName() + number,
                    employee.getLastName());
        }
        // Not found ?
        throw new EmployeeNotFoundException("Employee "+id+" not found");
    }

}
