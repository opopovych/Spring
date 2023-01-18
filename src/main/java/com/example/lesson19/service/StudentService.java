package com.example.lesson19.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


import com.example.lesson19.domain.Student;
import com.example.lesson19.repo.StudentRepo;
@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> showAll(){
		return studentRepo.findAll();
	}
	
	public void addStudent(MultipartFile file,String firstName, String lastName, int age) {
		Student student = new Student();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if (fileName.contains("..")) {
			System.out.println("file is not valid");
		}
		try {
			student.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch ( IOException e) {
			e.printStackTrace();
		}
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setAge(age);
		studentRepo.save(student);
	}
}
