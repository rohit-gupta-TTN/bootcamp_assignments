package com.ttn.jpa1;

import com.ttn.jpa1.entities.Employee;
import com.ttn.jpa1.repositories.EmployeeRepository;
import org.hibernate.query.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.yaml.snakeyaml.introspector.Property;

import java.security.PublicKey;
import java.util.List;

@SpringBootTest
class Jpa1ApplicationTests {
@Autowired
EmployeeRepository repo;
//Q.3
@Test
	void testCreate(){
	Employee employee=new Employee("Shimla","krishna",27);
	repo.save(employee);
}
//Q.4
@Test
void testUpdate(){
Employee e=repo.findById(1).get();
e.setName("kunal");
e.setLocation("Bihar");
e.setAge(45);
	repo.save(e);
}
	//Q.5
	@Test
	void testDelete(){
		Employee e=repo.findById(1).get();
repo.delete(e);
	}
	//Q.6
	@Test
	void testRead(){
		Employee e=repo.findById(1).get();
		System.out.println(e.getName());
		System.out.println(e.getAge());
	}
	//Q.7
	@Test
	void testCount(){
		long count=repo.count();
		System.out.println(count);
	}

	//Q.8
	@Test
	void testPagingAndSorting(){
		repo.findAll(PageRequest.of(0, 4, Sort.by(Sort.Direction.ASC, "age"))).getContent().forEach((e)-> System.out.println(e.getName()));

	}

	//Q.9
	@Test
	void testFinder1(){
	repo.findByName("Rohit").forEach(e-> System.out.println(e.getLocation()));

	}

	//Q.10
	@Test
	void testFinder2(){
		repo.findByNameStartingWith("Ro").forEach(e-> System.out.println(e.getName()));

	}

	//Q.11
	@Test
	void testFinder3(){
		repo.findByAgeBetween(0,50).forEach(e-> System.out.println(e.getName()));

	}
}
