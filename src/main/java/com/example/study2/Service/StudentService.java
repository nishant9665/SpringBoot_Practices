package com.example.study2.Service;

import java.util.List;

import com.example.study2.entities.Student;

public interface StudentService {
	
	public boolean addStudentDetails(Student std);// Create,   insert
	public List<Student> getAllStudentDetails();// Read,       select , get
	public Student getDetailsByID(long id ); // Read,          select , get
	public boolean updateStudentDetails(long id ,float marks); //update, insert
	public boolean deleteStudentDetails(long id); // delete
	
	

}
