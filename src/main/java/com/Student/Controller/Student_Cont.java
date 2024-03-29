package com.Student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mail.Repository.StudentRepo;
import com.Student.Entity.Student;

@RestController
public class Student_Cont {
	
	@Autowired
	private StudentRepo studentRepo;
	@GetMapping
	public Student getData(@RequestBody Student student)
	{
		return studentRepo.save(student);
	}
	
	

}
