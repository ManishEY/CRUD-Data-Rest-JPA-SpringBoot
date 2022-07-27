package com.springboot.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.crud.entity.Employee;

//@RepositoryRestResource(path="members")// /members will be exposed instead of default /employees
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
