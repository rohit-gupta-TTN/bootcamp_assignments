package com.ttn.springboot_assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
//For Question2 refer applicationproperties and propereader component below
//For Question3 we have data.sql in resources
//For Question4 dependency is added in pom.xml and we can hit few endpoints like
//http://localhost:8080/actuator/health
//http://localhost:8080/actuator/info
//For Question5 devtools aren't running in intellij ,may work fine in other IDEs as also discussed during session
@SpringBootApplication
public class SpringbootAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAssignmentApplication.class, args);


	}
}

//Question2
@Component
class PropertyReader implements CommandLineRunner {

	@Value("${app.name}")
	private String appName;

	@Value("${app.age}")
	private int appAge;

	@Override
	public void run(String... args) {
		System.out.println("Application Name: " + appName);
		System.out.println("Version: " + appAge);

	}
}
