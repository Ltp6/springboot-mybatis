package com.ltp.Controller;

import com.ltp.mapper.DepartmentMapper;
import com.ltp.mapper.EmployeeMapper;
import com.ltp.model.Department;
import com.ltp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping(value = "/emp/{id}")
    public Employee queryEmpById(@PathVariable(value = "id") Integer id){
        Employee employee = employeeMapper.queryEmpById(id);
        return employee;
    }
    @GetMapping(value = "/add")
    public Employee addEmp(Employee employee){
        employeeMapper.addEmp(employee);
        return employee;
    }
    @GetMapping(value = "/delete/{id}")
    public int deleteEmp(@PathVariable(value = "id") Integer id){
        return employeeMapper.deleteEmpById(id);
    }

    @GetMapping(value = "/update")
    public int updateDep(Employee employee){
        return employeeMapper.updateEmpById(employee);
    }
}
