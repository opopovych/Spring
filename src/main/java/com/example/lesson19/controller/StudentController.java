package com.example.lesson19.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.lesson19.domain.Student;

import com.example.lesson19.service.StudentService;

@Controller
public class StudentController {

	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String startPage(Model model) {
		List<Student> students = service.showAll();
		model.addAttribute("students", students);
		return "startPage";
	}
	@GetMapping("/add")
	public String add(Model model) {
		return "add";
	}
	@PostMapping("/add")
	public String addStudent(@RequestParam(value = "file") MultipartFile multipartFile,
			@RequestParam String firstName,
			@RequestParam String lastName,
			@RequestParam int age,
			Model model) {
		service.addStudent(multipartFile, firstName, lastName, age);
		return "redirect:/";
	}
}
