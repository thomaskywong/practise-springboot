package com.bootcamp.demospringbootemployee.service.impl;

import com.bootcamp.demospringbootemployee.database.EmployeeDatabase;
import com.bootcamp.demospringbootemployee.model.Employee;
import com.bootcamp.demospringbootemployee.service.EmployeeDatabaseService;

public class EmployeeDatabaseServiceImpl implements EmployeeDatabaseService  {

  @Override
  public Employee getEmployeeDatabase(int index) {
    return EmployeeDatabase.getDatabase(index);
  }

  @Override
  public void setEmployeeDatabase(int index, String name, double salary) {
    EmployeeDatabase.setDatabase(index, new Employee(name, salary));
  }
  
}
