package com.ttn.jpa1.repositories;

import com.ttn.jpa1.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

     //Q-9
    List<Employee> findByName(String name);
    //Q-10
    List<Employee> findByNameStartingWith(String s);
    //Q-11
    List<Employee> findByAgeBetween(int startAge, int endAge);




}
