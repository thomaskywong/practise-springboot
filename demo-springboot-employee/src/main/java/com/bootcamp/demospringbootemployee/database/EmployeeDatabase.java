package com.bootcamp.demospringbootemployee.database;

import com.bootcamp.demospringbootemployee.model.Employee;

public class EmployeeDatabase {

  private static final int dbSize = 10;
  private static Employee[] employees = new Employee[dbSize];

  public static Employee getDatabase(int index) {
    if (index < 0 || index >= dbSize)
      throw new IllegalArgumentException("Invalid index value.");

    return EmployeeDatabase.employees[index];
  }

  public static void setDatabase(int index, Employee employee) {
    if (index < 0 || index >= dbSize)
      throw new IllegalArgumentException("Invalid index value.");

    EmployeeDatabase.employees[index] = employee;
  }



}
