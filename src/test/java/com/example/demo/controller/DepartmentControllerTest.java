package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp() {
         department =
                Department
                        .builder()
                        .departmentName("Software")
                        .departmentAddress("Harare")
                        .departmentCode("D0001")
                        .departmentId(1L)
                        .build();
    }

    @Test
    void saveDepartment() throws Exception {
        Department inputDepartment =
                Department
                        .builder()
                        .departmentName("Software")
                        .departmentAddress("Harare")
                        .departmentCode("D0001")
                        .build();

        Mockito.when(departmentService.saveDepartment(inputDepartment))
                .thenReturn(department);

        mockMvc.perform(post("/departments/save")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\t\"departmentName\":\"Software\",\n" +
                        "\t\"departmentAddress\":\"Harare\",\n" +
                        "\t\"departmentCode\":\"D0001\"\n" +
                        "}"))
                .andExpect(status().isOk());
    }

    @Test
    void getDepartment() throws Exception {
        Mockito.when(departmentService.getDepartment(1L))
                .thenReturn(department);

        mockMvc.perform(get("/departments/one/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.departmentName")
                .value(department.getDepartmentName()));
    }
}