package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private EmployeeRepository repository;

    @MockBean
    private CustomRandom random;


    @Test
    public void callApiWithPathVariableAndDatabase() {
        when(random.nextInt(anyInt())).thenReturn(5);

        repository.save(new Employee(123,"Somkiat","Pui"));

        EmployeeResponse expected
                = new EmployeeResponse(123, "Somkiat5", "Pui");
        EmployeeResponse response
                = restTemplate.getForObject("/employee/123", EmployeeResponse.class);
        assertEquals(123, response.getId());
        assertEquals("Somkiat5", response.getFname());
        assertEquals("Pui", response.getLname());
        assertEquals(expected, response); // Pass ?
    }

    @Test
    public void callApiWithREquestParameter() {
        EmployeeResponse response
                = restTemplate.getForObject("/employee?id=999", EmployeeResponse.class);
        assertEquals(999, response.getId());
        assertEquals("Somkiat", response.getFname());
        assertEquals("Pui", response.getLname());
    }

    @Test
    public void postEmployee(){
        EmployeeRequest employeeRequest = new EmployeeRequest("Worapat" , "Tubtimdee");
        EmployeeResponse response = restTemplate.postForObject("/employee",employeeRequest,EmployeeResponse.class);
        assertEquals(999, response.getId());
        assertEquals("Worapat", response.getFname());
        assertEquals("Tubtimdee", response.getLname());
    }

}