package com.employee.api.exception.service;

import java.util.List;

public interface DepartmentService {
    com.employee.api.dto.DepartmentDto createDepartment(com.employee.api.dto.DepartmentDto departmentDto);

    com.employee.api.dto.DepartmentDto getDepartmentById(Long departmentId);

    List<com.employee.api.dto.DepartmentDto> getAllDepartments();

    com.employee.api.dto.DepartmentDto updateDepartment(Long departmentId, com.employee.api.dto.DepartmentDto updatedDepartment);

    void deleteDepartment(Long departmentId);
}