package com.bootcamp.jpa2.repositories;

import com.bootcamp.jpa2.entities.Employee;
import jakarta.transaction.Transactional;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("SELECT e.firstName, e.lastName FROM Employee e WHERE e.salary > (SELECT AVG(e2.salary) FROM Employee e2) " + "ORDER BY e.age ASC, e.salary DESC")
    List<Object[]> findEmployeeWithSalaryGreaterThan();

    @Query("SELECT AVG(e.salary) FROM Employee e")
    Integer findAverageSalary();

    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.salary = :newSalary WHERE e.salary < :avgSalary")
    void updateSalaryForEmployeesBelow(@Param("newSalary") Integer newSalary, @Param("avgSalary") Integer avgSalary);


    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Employee e WHERE e.salary = :minSalary")
    int deleteEmployeeWithMinSalary(@Param("minSalary") Integer minSalary);

    @Query("SELECT e.id, e.firstName, e.age FROM Employee e WHERE e.lastName LIKE %:lastName")
    List<Object[]> findEmployeesWithLastNameEndingWith(@Param("lastName") String lastName);

    @Modifying
    @Transactional
    @Query("DELETE FROM Employee e WHERE e.age > :age")
    void deleteEmployeesOlderThan(@Param("age") int age);
}
