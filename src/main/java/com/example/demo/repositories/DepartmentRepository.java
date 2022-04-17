package com.example.demo.repositories;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    public Department findByDepartmentName(String departmentName);

    // @Query("", nativeQuery = true), using a native query
    public Department findByDepartmentAddressIgnoreCase(String departmentAddress);
}
