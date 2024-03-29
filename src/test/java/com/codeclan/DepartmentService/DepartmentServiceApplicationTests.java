package com.codeclan.DepartmentService;

import com.codeclan.DepartmentService.models.Department;
import com.codeclan.DepartmentService.models.Employee;
import com.codeclan.DepartmentService.models.Project;
import com.codeclan.DepartmentService.repositories.DepartmentRepository;
import com.codeclan.DepartmentService.repositories.EmployeeRepository;
import com.codeclan.DepartmentService.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DepartmentServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeandDepartmentAndProject(){
		Department department = new Department("Software");
		departmentRepository.save(department);
		Employee employee = new Employee("Billy", "Roundaboot", 1, department);
		employeeRepository.save(employee);
		Project project = new Project("Cool Project", 100);
		projectRepository.save(project);
	}



}
