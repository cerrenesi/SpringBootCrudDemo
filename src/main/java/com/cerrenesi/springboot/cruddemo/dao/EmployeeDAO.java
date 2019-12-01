package com.cerrenesi.springboot.cruddemo.dao;

import com.cerrenesi.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int id);
    void save(Employee employee);
    void deleteById(int id);

}
