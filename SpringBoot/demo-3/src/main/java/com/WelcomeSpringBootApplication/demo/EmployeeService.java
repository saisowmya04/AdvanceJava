package com.WelcomeSpringBootApplication.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	Employee emp;
	
	public Employee getEmp() {
		return emp;
	}
}
