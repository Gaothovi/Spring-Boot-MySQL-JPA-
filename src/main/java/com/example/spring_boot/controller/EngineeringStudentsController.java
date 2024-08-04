package com.example.spring_boot.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.spring_boot.EngineeringStudents;
import com.example.spring_boot.repository.EngineeringStudentsRepository;

@RestController
@RequestMapping("/api/engineeringstudents")
public class EngineeringStudentsController {

    @Autowired
    private EngineeringStudentsRepository engineeringStudentsRepository;

    @GetMapping
    public List<EngineeringStudents> index() {
        return engineeringStudentsRepository.findAll();
    }

    @GetMapping("/{studentID}")
    public EngineeringStudents show(@PathVariable int studentID) {
        return engineeringStudentsRepository.findById(studentID)
            .orElseThrow(() -> new RuntimeException("Student not found with id " + studentID));
    }

    @PostMapping("/search")
    public List<EngineeringStudents> search(@RequestBody Map<String, String> body) {
        String department = body.get("department");
        String firstName = body.get("firstName");
        String lastName = body.get("lastName");

    
        Integer passOutYear = Integer.parseInt(body.get("passOutYear"));
        Integer universityRank = Integer.parseInt(body.get("universityRank"));

        return engineeringStudentsRepository.findByDepartmentContainingOrFirstNameContainingOrLastNameContainingAndPassOutYearOrUniversityRank(
            department, firstName, lastName, passOutYear, universityRank
        );
    }

    @PostMapping
    public EngineeringStudents create(@RequestBody Map<String, String> body) {
      
    	String department = body.get("department");
        String firstName = body.get("firstName");
        String lastName = body.get("lastName");

     
        Integer pass_out_year = Integer.parseInt(body.get("pass_out_year"));
        Integer university_rank = Integer.parseInt(body.get("university_rank"));

        return engineeringStudentsRepository.save(new EngineeringStudents(department, firstName, lastName, pass_out_year, university_rank));
    }

    @PutMapping("/{studentID}")
    public EngineeringStudents update(@PathVariable int studentID, @RequestBody Map<String, String> body) {
        EngineeringStudents engineeringStudents = engineeringStudentsRepository.findById(studentID)
            .orElseThrow(() -> new RuntimeException("Student not found with id " + studentID));

        engineeringStudents.setDepartment(body.get("department"));
        engineeringStudents.setFirstName(body.get("firstName"));
        engineeringStudents.setLastName(body.get("lastName"));

        
        Integer passOutYear = Integer.parseInt(body.get("passOutYear"));
        Integer universityRank = Integer.parseInt(body.get("universityRank"));

        engineeringStudents.setPassOutYear(passOutYear);
        engineeringStudents.setUniversityRank(universityRank);

        return engineeringStudentsRepository.save(engineeringStudents);
    }

    @DeleteMapping("/{studentID}")
    public boolean delete(@PathVariable int studentID) {
        engineeringStudentsRepository.deleteById(studentID);
        return true;
    }
}