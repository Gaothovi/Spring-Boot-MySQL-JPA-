package entity;

import jakarta.persistence.*;

@Entity
@Table(name="engineeringstudents")
public class EngineeringStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_ID")
    private int studentId;

    @Column(name="Department")
    private String department;

    @Column(name="First_Name")
    private String firstName;

    @Column(name="Last_Name")
    private String lastName;

    @Column(name="pass_out_year")
    private Integer passOutYear;

    @Column(name="university_rank")
    private Integer universityRank;

    public EngineeringStudent() {   // constructor used for JPA
    }

    public EngineeringStudent(String department, String firstName, String lastName, Integer passOutYear, Integer universityRank) {
        
    	this.department = department;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passOutYear = passOutYear;
        this.universityRank = universityRank;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPassOutYear() {
        return passOutYear;
    }

    public void setPassOutYear(Integer passOutYear) {
        this.passOutYear = passOutYear;
    }

    public Integer getUniversityRank() {
        return universityRank;
    }

    public void setUniversityRank(Integer universityRank) {
        this.universityRank = universityRank;
    }

    @Override
    public String toString() {
        return "EngineeringStudent[studentId=" + studentId + ", department=" + department + ", firstName=" + firstName + 
               ", lastName=" + lastName + ", passOutYear=" + passOutYear + ", universityRank=" + universityRank + "]";
    }
}