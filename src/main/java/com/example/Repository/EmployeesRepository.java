package com.example.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}
