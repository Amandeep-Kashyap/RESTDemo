package com.apiexample.RestfulApi.repository;

import com.apiexample.RestfulApi.Entity.EmpUnderManagerDTO;
import com.apiexample.RestfulApi.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {

    @Query(value = "    SELECT e.employee_ID, e.first_name, j.job_title, e.department_id, e.hire_date " +
            "from EMPLOYEES e JOIN JOBS j ON e.JOB_ID = j.JOB_ID WHERE e.MANAGER_ID = :m", nativeQuery = true)
    List<Object[]> fetchEmployeesByManager(@Param(value = "m") Long managerId);
}
