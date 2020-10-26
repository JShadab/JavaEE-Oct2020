package com.pyjac.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyjac.demo.beans.Employee;
import com.pyjac.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/hello")
	public String sayHello() {
		return "Hello From RESTful Web Services";
	}

	@PostMapping(value = "/emp")
	public void save(Employee employee) {
		employeeService.save(employee);
	}

	@PutMapping(value = "/emp")
	public void update(Employee employee) {
		employeeService.update(employee);
	}

	@DeleteMapping(value = "/emp")
	public void delete(Employee employee) {
	}

	@GetMapping(value = "/emp/{ }")
	public Employee getEmployee(@PathVariable int empId) {
		return employeeService.getEmployee(empId);
	}

	@GetMapping(value = "/emp")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
}
