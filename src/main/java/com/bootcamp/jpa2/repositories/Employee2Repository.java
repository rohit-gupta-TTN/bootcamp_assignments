package com.bootcamp.jpa2.repositories;

import com.bootcamp.jpa2.entities.Employee;
import com.bootcamp.jpa2.entities.Employee2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee2Repository extends JpaRepository<Employee2,Integer> {

}
