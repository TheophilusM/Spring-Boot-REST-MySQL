package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImplementation implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImplementation(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
