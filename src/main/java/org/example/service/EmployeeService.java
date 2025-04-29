package org.example.service;

import org.example.dto.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> all();

    void add(Employee employee);

    Employee search(Integer id);

    void update(Employee employee);

    void delete(Integer id);
}
