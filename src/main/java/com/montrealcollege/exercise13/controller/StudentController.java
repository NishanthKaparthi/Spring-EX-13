package com.montrealcollege.exercise13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.montrealcollege.exercise13.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "studentForm";
	}
	@PostMapping("/createStudent")
	public String  createStudent(@ModelAttribute("student")Student student, Model model) {
		model.addAttribute("name", student.getFirstName()+" "+student.getLastName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("phone", student.getPhoneNumber());
		model.addAttribute("address", student.getAddress());
		
		return "result";
	}

}
