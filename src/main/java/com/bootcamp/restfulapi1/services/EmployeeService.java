package com.bootcamp.restfulapi1.services;

import com.bootcamp.restfulapi1.entity.Employee;
import com.bootcamp.restfulapi1.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    public static   List<Employee> employeeList=new ArrayList<>();
    static {
        employeeList.add(new Employee(1,22,"Rohit"));
        employeeList.add(new Employee(2,31,"Shikhar"));
        employeeList.add(new Employee(3,25,"Deepak"));

    }

public List<Employee> allEmployees(){
    return employeeList;
};
public Employee findone(int id){
      for(Employee e:employeeList){
          if(e.getId()==id){return e;};
      };
      throw new EmployeeNotFoundException("Employee dosen't exist");

};
public String addone(Employee e){
    employeeList.add(e);
    return "Employee added";
}
    public String delone(int id){
        for(Employee e:employeeList){
            if(e.getId()==id){
                employeeList.remove(e);
                return "Employee deleted";
            }
        }
        throw new EmployeeNotFoundException("Element dosen't exist");
    }
    public String updateone(int id,Employee newE){
        for(Employee e:employeeList){
            if(e.getId()==id){
                employeeList.set(id-1,newE);
                return "Employee updated";
            }
        }
        throw new EmployeeNotFoundException("Element dosen't exist");
    }
}
