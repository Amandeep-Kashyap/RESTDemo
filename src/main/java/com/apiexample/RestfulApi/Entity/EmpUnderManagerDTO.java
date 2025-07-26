package com.apiexample.RestfulApi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class EmpUnderManagerDTO {
    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false)
    private Long employeeId;

    @Column(name = "FIRST_NAME", length = 20)
    private String firstName;

    @Column(name = "JOB_TITLE", length = 35)
    private String jobTitle;

    @Column(name = "DEPARTMENT_ID")
    private Integer departmentId;

    @Column(name = "HIRE_DATE", nullable = false)
    private Date hireDate;

    public EmpUnderManagerDTO(long l, String s, String s1, int i, Date date) {
    }
}
