package com.apiexample.RestfulApi.controller;

import com.apiexample.RestfulApi.Entity.EmpUnderManagerDTO;
import com.apiexample.RestfulApi.Entity.Employees;
import com.apiexample.RestfulApi.repository.EmployeeRepository;
import com.apiexample.RestfulApi.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Employees")
@Tag(name = "CRUD Operation for employees in Restful API", description = "All crud operation of employees in organisation")
public class EmployeeController {
//    @Autowired
//    private EmployeeRepository repo;

    @Autowired
    private EmployeeService empService;

//    @GetMapping("/getAllEmployees")
//    @Operation(summary = "Get All Employees Rest API", description = "To get all employees in org")
//    @ApiResponse(responseCode = "200", description = "Fetched Successfully!")
//    public List<Employees> getAllEmployees(){
//        return repo.findAll();
//    }

//    @GetMapping("{Employee_Id}")
//    @Operation(summary = "Get Specific Employees Rest API", description = "To get the employees in org using id")
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "Employee Found!"),
//            @ApiResponse(responseCode = "404", description = "Employee Not Found!")
//    })
//    public Employees getEmployee(@PathVariable Long Employee_Id){
//        return repo.findById(Employee_Id).get();
//    }


    @GetMapping("/GetEmployee/{ManagerId}")
    public ResponseEntity<List<EmpUnderManagerDTO>> getEmployeeUnderManager(@PathVariable Long ManagerId){
        List<EmpUnderManagerDTO> employee = empService.fetchEmployeesByManager(ManagerId);
        if(employee.isEmpty()){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(employee);
        }
    }
}
