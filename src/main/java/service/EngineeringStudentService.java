package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.EngineeringStudent;
import repository.EngineeringStudentsRepository;
import java.util.List;

@Service
public class EngineeringStudentService {

	@Autowired
	private EngineeringStudentsRepository engineeringStudentRepository;
	
	public EngineeringStudent createEngineeringStudent(EngineeringStudent engineeringStudent) {
		return engineeringStudentRepository.save(engineeringStudent);
	}
	
	public List<EngineeringStudent> getAllEngineeringStudents(){
		return engineeringStudentRepository.findAll();
	}
	
	public EngineeringStudent getEngineeringStudentById(int studentId) {
		return engineeringStudentRepository.findById(studentId).orElse(null);
	}
	public EngineeringStudent updateEngineeringStudent(int studentId, EngineeringStudent engineeringStudent) {
		engineeringStudent.setStudentId(studentId);
		return engineeringStudentRepository.save(engineeringStudent);	
	}
	
	public void deleteEngineeringStudent(int studentId) {
		engineeringStudentRepository.deleteById(studentId);
	}
	

}
