package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public ArrayList<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee -> employees.add(employee));
		return (ArrayList<Employee>) employees;
	}

	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id);
	}

	public void saveOrUpdate(Employee emp) {
		employeeRepository.save(emp);
	}

	public void delete(int id) {
		employeeRepository.deleteById(id);
	}

}