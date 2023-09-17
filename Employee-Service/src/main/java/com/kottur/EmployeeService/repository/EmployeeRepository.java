package com.kottur.EmployeeService.repository;

import com.kottur.EmployeeService.exception.EmployeeNotFoundException;
import com.kottur.EmployeeService.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee employee){
        employees.add(employee);
        return employee;
    }

    public Employee findEmployeeById(Long id){
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElseThrow(()->new EmployeeNotFoundException("Employee not found with id"+id));
    }

    public List<Employee> findAllEmployees(){
        return employees;
    }
}
