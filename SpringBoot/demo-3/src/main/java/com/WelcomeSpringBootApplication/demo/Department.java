package com.WelcomeSpringBootApplication.demo;

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
public class Department {
	@Value("java")
	private String dname;
	@Value("hyderabad")
	private String location;

}
