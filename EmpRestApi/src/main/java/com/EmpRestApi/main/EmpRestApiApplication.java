package com.EmpRestApi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.EmpRestApi.controller","com.EmpRestApi.service"})
@EnableJpaRepositories(basePackages="com.EmpRestApi.repository")
@EntityScan(basePackages="com.EmpRestApi.model")

public class EmpRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpRestApiApplication.class, args);
		System.out.println("table created successfully");
	}

}
