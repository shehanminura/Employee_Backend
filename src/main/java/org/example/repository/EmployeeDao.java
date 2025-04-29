package org.example.repository;

import org.example.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<EmployeeEntity,Integer> {
}
