package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import entity.EngineeringStudent;
import service.EngineeringStudentService;

@RestController
@RequestMapping("/api/engineeringstudents")
public class EngineeringStudentsController {

    @Autowired
    private EngineeringStudentService engineeringStudentService;

    @GetMapping
    public List<EngineeringStudent> getAllEngineeringStudents() {
        return engineeringStudentService.getAllEngineeringStudents();
    }

    @GetMapping("/{studentId}")
    public EngineeringStudent getEngineeringStudentById(@PathVariable int studentId) {
        return engineeringStudentService.getEngineeringStudentById(studentId);
    }

    @PostMapping
    public EngineeringStudent createEngineeringStudent(@RequestBody EngineeringStudent engineeringStudent) {
        return engineeringStudentService.createEngineeringStudent(engineeringStudent);
    }

    @PutMapping("/{studentId}")
    public EngineeringStudent updateEngineeringStudent(@PathVariable int studentId, @RequestBody EngineeringStudent engineeringStudent) {
        return engineeringStudentService.updateEngineeringStudent(studentId, engineeringStudent);
    }

    @DeleteMapping("/{studentId}")
    public String deleteEngineeringStudentById(@PathVariable int studentId) {
        engineeringStudentService.deleteEngineeringStudent(studentId);
        return "Deleted correctly";
    }
}