package com.kottur.EmployeeService.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private List<Leaves> leaves = new ArrayList<Leaves>();


    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
