package com.EmpRestApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmpRestApi.model.Employee;
import com.EmpRestApi.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	private final EmployeeService es;

	public EmployeeController(EmployeeService es) {
		this.es = es;
	}
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp) {
		return es.addEmployee(emp);
	}
	
	@GetMapping
	public List<Employee> getAllEmp(){
		return es.getAllEmp();
	}
	
	@DeleteMapping("/{eid}")
	public void deleteEmp(@PathVariable int eid) {
		es.deleteId(eid);
	}
	
	@PutMapping("{eid}")
	public Employee updateEmp(@RequestBody Employee emp,@PathVariable int eid) {
		return es.updateEmp(emp, eid);
		
	}
}
