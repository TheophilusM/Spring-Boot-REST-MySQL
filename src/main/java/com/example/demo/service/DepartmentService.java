package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFound;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartment();

    Department getDepartment(Long departmentId) throws DepartmentNotFound;

    void deleteDepartment(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department getDepartmentByName(String departmentName);

    Department getDepartmentByAddress(String departmentAddress);
}
