package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import entity.EngineeringStudent;

import java.util.List;

@Repository
public interface EngineeringStudentsRepository extends JpaRepository<EngineeringStudent, Integer> {
    List<EngineeringStudent> findByDepartmentContainingOrFirstNameContainingOrLastNameContainingAndPassOutYearOrUniversityRank(
            String department, 
            String firstName, 
            String lastName, 
            Integer passOutYear, 
            Integer universityRank);
}