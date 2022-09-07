package com.es.esspringbootbackend;

import com.es.esspringbootbackend.entity.Employee;
import com.es.esspringbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EsSpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EsSpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = Employee.builder()
				.firstName("Josh")
				.lastName("Underwood")
				.email("ramesh@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("Peter")
				.lastName("Parker")
				.email("tony@gmail.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("Chris")
				.lastName("Evans")
				.email("cena@gmail.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
