package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Employee findById(int id);

	Employee deleteById(int id);

}