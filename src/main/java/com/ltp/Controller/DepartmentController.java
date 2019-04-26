package com.ltp.Controller;

import com.ltp.mapper.DepartmentMapper;
import com.ltp.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dept")
public class DepartmentController {
    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping(value = "/dep/{id}")
    public Department queryDepById(@PathVariable(value = "id") Integer id){
        Department department = departmentMapper.queryDepById(id);
        return department;
    }
    @GetMapping(value = "/add")
    public Department addDept(Department department){
        departmentMapper.addDept(department);
        return department;
    }
    @GetMapping(value = "/delete/{id}")
    public int deleteDep(@PathVariable(value = "id") Integer id){
        return departmentMapper.deleteDept(id);
    }

    @GetMapping(value = "/update")
    public int updateDep(Department department){
        return departmentMapper.updateDep(department);
    }
}
