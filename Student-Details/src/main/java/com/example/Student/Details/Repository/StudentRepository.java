package com.example.Student.Details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.Details.Entity.StudentEntity;

@Repository
	public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
	}

