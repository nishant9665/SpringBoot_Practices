package com.example.study2.Service;

import java.util.List;

import com.example.study2.entities.Student;

public interface StudentService {
	
	public boolean addStudentDetails(Student std);
	public List<Student> getAllStudentDetails();
	public Student getDetailsByID(long id );
	
	

}
