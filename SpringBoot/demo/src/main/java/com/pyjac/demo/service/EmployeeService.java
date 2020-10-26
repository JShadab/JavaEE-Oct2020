package com.pyjac.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pyjac.demo.beans.Employee;

@Service
public class EmployeeService {

	public void save(Employee employee) {
	}

	public void update(Employee employee) {
	}

	public void delete(Employee employee) {
	}

	public Employee getEmployee(int empId) {

		return new Employee("Shadab", 33, 1234);
	}

	public List<Employee> getAllEmployee() {

		return null;
	}

}
