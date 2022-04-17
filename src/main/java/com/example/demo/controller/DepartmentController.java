package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.DepartmentServiceImplementation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments/save")
    public Department saveDepartment(@Valid @RequestBody Department department) { // convert request body into department object
        logger.info("Saved department");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments/all")
    public List<Department> getAllDepartment() {
        logger.info("Fetch all department");
        return departmentService.getAllDepartment();
    }

    @GetMapping("/departments/one/{id}")
    public Department getDepartment(@PathVariable("id") Long departmentId) {
        logger.info("Get one department");
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

    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName) {
        return departmentService.getDepartmentByName(departmentName);
    }

    @GetMapping("/departments/address/{address}")
    public Department getDepartmentByAddress(@PathVariable("address") String departmentAddress) {
        return departmentService.getDepartmentByAddress(departmentAddress);
    }
}
