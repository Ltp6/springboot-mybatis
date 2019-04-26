package com.ltp.mapper;


import com.ltp.model.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
//添加注解告诉Mybatis该文件问Mapper接口文件，或者直接在SpringBoot主程序中配置包扫描
//@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id = #{id}")
    Department queryDepById(Integer id);

    //useGeneratedKeys开启驼峰命令法，及下划线拼接
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values (#{department_name}) ")
    int addDept(Department department);

    @Delete("delete from department where id = #{id}")
    int deleteDept(Integer id);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    int updateDep(Department department);

}
