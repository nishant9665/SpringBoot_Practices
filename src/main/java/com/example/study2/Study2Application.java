package com.example.study2;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.study2.Service.StudentService;
import com.example.study2.Service.StudentServiceImpl;
import com.example.study2.entities.Student;

@SpringBootApplication
public class Study2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Study2Application.class, args);
		StudentService stdService = context.getBean(StudentServiceImpl.class);
		System.out.println("Nishant in Allstate...");
		
		
		
		//----------- Insert Operations
//      Student std = new Student();	
//		std.setName("Nishant");
//		std.setRollno(205);
//		std.setMark(52.30f);
//		
//		boolean status =stdService.addStudentDetails(std);
//		if(status) {
//			System.out.println("Student record insert successfully");
//		}
//		else {
//			System.out.println("Student record is not inserted due to error");
//		}
		
		//----------Select Operation / Read operation
		
		List <Student> stdlist = stdService.getAllStudentDetails();
		for(Student stds:stdlist) {
			System.out.println("Id : "+stds.getId());
			System.out.println("Name :"+stds.getName());
			System.out.println("RollNo :"+stds.getRollno());
			System.out.println("Marks : "+stds.getMark());
			System.out.println("-----------------------------------");
		}
		
		
		
	}

}
