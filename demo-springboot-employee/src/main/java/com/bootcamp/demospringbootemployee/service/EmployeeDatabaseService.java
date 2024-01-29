package com.bootcamp.demospringbootemployee.service;

import com.bootcamp.demospringbootemployee.model.Employee;

public interface EmployeeDatabaseService {

  Employee getEmployeeDatabase(int index);

  void setEmployeeDatabase(int index, String name, double salary);
  
}
