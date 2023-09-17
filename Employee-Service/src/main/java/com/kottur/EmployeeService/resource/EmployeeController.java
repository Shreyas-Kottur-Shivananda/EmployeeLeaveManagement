package com.kottur.EmployeeService.resource;

import com.kottur.EmployeeService.model.Employee;
import com.kottur.EmployeeService.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @PostMapping(value = "/addEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.addEmployee(employee);
    }

    @GetMapping(value = "/employee/{id}")
    public Employee findEmployeeById(@PathVariable("id") Long id){
        return employeeRepository.findEmployeeById(id);
    }

    @GetMapping(value = "/employees")
    public List<Employee> findEmployees(){
        return employeeRepository.findAllEmployees();
    }
}
