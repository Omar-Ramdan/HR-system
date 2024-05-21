package com.example.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Departments;

public interface DepartmentsRepository extends CrudRepository<Departments, Integer> {

}
