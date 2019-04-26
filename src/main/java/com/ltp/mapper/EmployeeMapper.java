package com.ltp.mapper;

import com.ltp.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeMapper {

    Employee queryEmpById(Integer id);

    int addEmp(Employee employee);

    int deleteEmpById(Integer id);

    int updateEmpById(Employee employee);
}
