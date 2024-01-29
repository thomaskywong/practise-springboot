package com.bootcamp.demospringbootemployee.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demospringbootemployee.controller.DatabaseController;
import com.bootcamp.demospringbootemployee.model.Employee;
import com.bootcamp.demospringbootemployee.service.impl.EmployeeDatabaseServiceImpl;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")
public class DatabaseControllerImpl implements DatabaseController {

  @Override
  public Employee getEmployeeDatabase(int index) {
    return new EmployeeDatabaseServiceImpl().getEmployeeDatabase(index);
  }

  @Override
  public void setEmployeeDatabase(int index, String name, double salary) {
    new EmployeeDatabaseServiceImpl().setEmployeeDatabase(index, name, salary);
  }

  
}
