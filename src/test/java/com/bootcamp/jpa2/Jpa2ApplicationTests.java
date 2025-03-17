package com.bootcamp.jpa2;

import com.bootcamp.jpa2.entities.*;
import com.bootcamp.jpa2.repositories.BankRepository;
import com.bootcamp.jpa2.repositories.Employee2Repository;
import com.bootcamp.jpa2.repositories.EmployeeRepository;
import com.bootcamp.jpa2.repositories.VehicleRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class Jpa2ApplicationTests {
	@Autowired
	EmployeeRepository repo;
	@Autowired
	VehicleRepository vehicleRepo;
	@Autowired
	Employee2Repository employee2Repo;

@Autowired
BankRepository bankRepo;
	@Test
	void insert(){
		repo.save(new Employee(76,80000,"singh","vijay"));
	}

	@Test//q1.1
void findFullNameWithConditionstest(){
		List<Object[]>res=repo.findEmployeeWithSalaryGreaterThan();
		res.forEach(e-> System.out.println(e[0]));
	}
	@Test//q1.2
	void updatesalarytest() {
		Integer avgSalary = repo.findAverageSalary();
		repo.updateSalaryForEmployeesBelow(400000, avgSalary);
	}
	@Test//q.1.3
	void deleteMinimumSalarytest(){
	repo.deleteEmployeeWithMinSalary(80000);
	}
	@Test//q.2.1
	void lastnamesuffixtest() {
		List<Object[]> res = repo.findEmployeesWithLastNameEndingWith("singh");
		res.forEach(e -> System.out.println(e[0] + "  " + e[1] + " " + e[2]));
	}
		@Test//q.2.2
		void deleteolderthanagetest(){
repo.deleteEmployeesOlderThan(503);
		}

@Test//q3.1
	void SingleTabletest(){
	FullTimeEmployee emp1 = new FullTimeEmployee();
	emp1.setFirstName("Rajesh");
	emp1.setLastName("Sharma");
	emp1.setSalary(75000);
	emp1.setBonus(10000);

	PartTimeEmployee emp2 = new PartTimeEmployee();
	emp2.setFirstName("Amit");
	emp2.setLastName("Verma");
	emp2.setSalary(40000);
	emp2.setHoursWorked(20);

	repo.save(emp1);
	repo.save(emp2);
}

@Test //q3.2
	void joinedtest(){
	Car car1 = new Car();
	car1.setBrand("Tata");
	car1.setPrice(1200000);
	car1.setSeatingCapacity(5);
	car1.setHasSunroof(true);

	Bike bike1 = new Bike();
	bike1.setBrand("Royal Enfield");
	bike1.setPrice(200000);
	bike1.setEngineCC(350);

	vehicleRepo.save(car1);
	vehicleRepo.save(bike1);
}

@Test//Q3.3
	void tablestrategytest(){
		SavingsAccount savings1 = new SavingsAccount();
		savings1.setAccountHolder("Amit Verma");
		savings1.setBalance(50000);
		savings1.setInterestRate(4.5);

		CurrentAccount current1 = new CurrentAccount();
		current1.setAccountHolder("Rajesh Gupta");
		current1.setBalance(200000);
		current1.setLimitt(50000);

		bankRepo.save(savings1);
		bankRepo.save(current1);
	}
	@Test//q.4
	void componentmappingtest(){
		SalaryDetails salaryDetails = new SalaryDetails();

		salaryDetails.setBasicSalary(75000);
		salaryDetails.setBonusSalary(10000);
		salaryDetails.setTaxAmount(5000);
		salaryDetails.setSpecialAllowanceSalary(7000);

		Employee2 e= new Employee2();

		e.setFirstName("Rahul");
		e.setLastName("Kapoor");
		e.setAge(35);
		e.setSalaryDetails(salaryDetails);
		employee2Repo.save(e);
	}
}