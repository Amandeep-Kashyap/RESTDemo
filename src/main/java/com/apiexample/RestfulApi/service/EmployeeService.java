package com.apiexample.RestfulApi.service;

import com.apiexample.RestfulApi.Entity.EmpUnderManagerDTO;
import com.apiexample.RestfulApi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public List<EmpUnderManagerDTO> fetchEmployeesByManager(Long managerId){
        List<Object[]> results = repo.fetchEmployeesByManager(managerId);
        return results
                .stream()
                .map(row -> new EmpUnderManagerDTO(
                        ((Number)row[0]).longValue(),
                        (String) row[1],
                        (String) row[2],
                        ((Number)row[3]).intValue(),
                        (Date) row[4]
                )).collect(Collectors.toList());
    }
}
