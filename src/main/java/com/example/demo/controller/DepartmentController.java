package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.DepartmentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments/save")
    public Department saveDepartment(@RequestBody Department department) { // convert request body into department object
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments/all")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @GetMapping("/departments/one/{id}")
    public Department getDepartment(@PathVariable("id") Long departmentId) {
        return departmentService.getDepartment(departmentId);
    }

    @DeleteMapping("/departments/delete/{id}")
    public String deleteDepartment(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartment(departmentId);
        return "Department deleted successfully: " + departmentId;
    }

    @PutMapping("/departments/update/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }
}
