package com.WelcomeSpringBootApplication.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo3Application {
	
	@Autowired
	EmployeeService emps;

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Demo3Application.class, args);
		System.out.println("Welcome to Spring Boot Application");
		Demo3Application da=context.getBean(Demo3Application.class);
		Employee emp=da.emps.getEmp();
		
//		System.out.println(emp.getEid());
//		System.out.println(emp.getEname());
//		System.out.println(emp.getDept());
		
		System.out.println(emp);
	}

}
