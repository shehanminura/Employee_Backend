package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@CrossOrigin

public class EmployeeController {
 final EmployeeService service;

     @GetMapping("/all")
    public List<Employee> all(){
        List<Employee> all = service.all();
        System.out.println(all);
        return all;
    }

    @PostMapping("/add")
    public void add(@RequestBody Employee employee){
        service.add(employee);
    }

    @GetMapping("/search-by-id/{id}")
    public Employee search(@PathVariable("id") Integer id){
        return service.search(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Employee employee){
        service.update(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        service.delete(id);
    }

}
