package org.example.service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.entity.EmployeeEntity;
import org.example.repository.EmployeeDao;
import org.example.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    final ModelMapper mapper;
    final EmployeeDao dao;

    @Override
    public List<Employee> all() {
        ArrayList<Employee> objects = new ArrayList<>();
        dao.findAll().forEach(employeeEntity -> {
            objects.add(mapper.map(employeeEntity, Employee.class));
        });
        return objects;
    }

    @Override
    public void add(Employee employee) {
        dao.save(mapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public Employee search(Integer id) {
        return mapper.map(dao.findById(id), Employee.class);
    }

    @Override
    public void update(Employee employee) {
        dao.save(mapper.map(employee,EmployeeEntity.class));
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }
}
