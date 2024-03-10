package io.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.example.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{


	Optional<Employee> findEmployeeById(Long id);

}
