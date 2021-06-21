package com.example.hellorest;

import com.example.hellorest.employee.CustomRandom;
import com.example.hellorest.employee.EmployeeResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
class HelloRestApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@MockBean
	private CustomRandom random;

	@Test
	public void callApiWithPathVariable() {
		when(random.nextInt(anyInt())).thenReturn(5);

		EmployeeResponse expected
				= new EmployeeResponse(123, "Somkiat5", "Pui");
		EmployeeResponse response
				= restTemplate.getForObject("/employee/123", EmployeeResponse.class);
		assertEquals(123, response.getId());
		assertEquals("Somkiat5", response.getFname());
		assertEquals("Pui", response.getLname());
		assertEquals(expected, response); // Pass ?
	}

}
