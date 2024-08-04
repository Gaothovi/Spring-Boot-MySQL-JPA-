package com.example.spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.spring_boot.EngineeringStudents;
import java.util.List;

@Repository
public interface EngineeringStudentsRepository extends JpaRepository<EngineeringStudents, Integer> {
    List<EngineeringStudents> findByDepartmentContainingOrFirstNameContainingOrLastNameContainingAndPassOutYearOrUniversityRank(
            String department, 
            String firstName, 
            String lastName, 
            Integer passOutYear, 
            Integer universityRank);
}