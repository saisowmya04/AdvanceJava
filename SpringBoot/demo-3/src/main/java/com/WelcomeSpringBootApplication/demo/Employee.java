package com.WelcomeSpringBootApplication.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
@Data
@Component
public class Employee {
	
	@Value("101")
	private int eid;
	@Value("Ram")
	private String ename;
	@Autowired
	private Department dept;
	

}
