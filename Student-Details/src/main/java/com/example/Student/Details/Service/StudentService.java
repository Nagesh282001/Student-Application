package com.example.Student.Details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.Details.Entity.StudentEntity;
import com.example.Student.Details.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public List<StudentEntity> getAllStudents() {
		return studentRepository.findAll();
	}

	public StudentEntity getStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	public StudentEntity createStudent(StudentEntity student) {
		return studentRepository.save(student);
	}

	public StudentEntity updateStudent(Long id, StudentEntity newStudentData) {
		Optional<StudentEntity> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			StudentEntity existingStudent = optionalStudent.get();
			if (newStudentData.getStudentName() != null && !newStudentData.getStudentName().isEmpty())
				existingStudent.setStudentName(newStudentData.getStudentName());
			if (newStudentData.getStudentGrade() != null && !newStudentData.getStudentGrade().isEmpty())
				existingStudent.setStudentGrade(newStudentData.getStudentGrade());
			if (newStudentData.getStudentPercentage() > 0)
				existingStudent.setStudentPercentage(newStudentData.getStudentPercentage());
			// You can update other fields as well if needed

			return studentRepository.save(existingStudent);
		}
		return null; // Or throw an exception indicating that the student with the given ID was not
						// found
	}

	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}
