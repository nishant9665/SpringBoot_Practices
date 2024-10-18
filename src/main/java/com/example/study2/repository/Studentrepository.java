package com.example.study2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study2.entities.Student;

public interface Studentrepository extends JpaRepository<Student, Long> {
	
	

}
