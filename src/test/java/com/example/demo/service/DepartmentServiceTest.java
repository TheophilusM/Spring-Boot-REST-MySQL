package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repositories.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department =
                Department
                .builder()
                .departmentName("Software")
                .departmentAddress("Harare")
                .departmentCode("D0001")
                .departmentId(1L)
                .build();

        Mockito.when(departmentRepository.findByDepartmentName("Software"))
                .thenReturn(department);
    }

    @Test
    public void whenValidDepartmentName_thenDepartmentShouldFound() {
        String departmentName = "Software";
        Department found =
                departmentService.getDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());


    }
}