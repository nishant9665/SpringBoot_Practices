package com.example.study2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study2.entities.Student;
import com.example.study2.repository.Studentrepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private Studentrepository studentrepository;

	@Override
	public boolean addStudentDetails(Student std) {
		boolean status = false;
		try {
			studentrepository.save(std);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			status = false;
		}
		return status;
	}

	@Override
	public List<Student> getAllStudentDetails() {
		// TODO Auto-generated method stub
		return studentrepository.findAll();
	}

	public Student getDetailsByID(long id) {
		Optional<Student> optional = studentrepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

}
