package com.example.Student.Details.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private int studentPercentage;
	private String studentGrade;

	public StudentEntity(int studentId, String studentName, int studentPercentage, String studentGrade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPercentage = studentPercentage;
		this.studentGrade = studentGrade;
	}

	public StudentEntity() {
		// Default constructor required by Hibernate
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentPercentage() {
		return studentPercentage;
	}

	public void setStudentPercentage(int studentPercentage) {
		this.studentPercentage = studentPercentage;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public void setId(Long id) {
		// TODO Auto-generated method stub

	}
}
