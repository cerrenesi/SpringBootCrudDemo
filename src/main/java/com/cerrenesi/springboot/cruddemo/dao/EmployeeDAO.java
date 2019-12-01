package com.cerrenesi.springboot.cruddemo.dao;

import com.cerrenesi.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
