package com.example.Service;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.example.Repository.DepartmentsRepository;

import com.example.model.Departments;
import com.example.model.Employees;

@Service
@Transactional
public class DepartmentService {

	private final DepartmentsRepository departmentsRepository;
	
	  //Construct injection
		public DepartmentService(DepartmentsRepository departmentsRepository) {

			this.departmentsRepository = departmentsRepository;

		}
		public void saveMyDepartment(Departments department) {

			departmentsRepository.save(department);
		}
	
}
