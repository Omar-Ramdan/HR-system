package com.example.Service;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.example.Repository.EmployeesRepository;

import com.example.model.Employees;

@Service
@Transactional
public class EmployeeService {

	private final EmployeesRepository employeesRepository;
	
	  //Construct injection
		public EmployeeService(EmployeesRepository employeesRepository) {

			this.employeesRepository = employeesRepository;

		}

		
		public void saveMyEmployee(Employees employee) {

			employeesRepository.save(employee);
		}
	
}
