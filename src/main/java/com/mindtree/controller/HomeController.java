package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.Student;
import com.mindtree.service.CrudService;

@RestController
public class HomeController {
	
	@Autowired
	private CrudService cservice;
	
	@GetMapping("/get")
	public List<Student> run() {
	
		return cservice.printstudent();
	}
	
	@PostMapping("/save")
	public void run1(@RequestBody Student s)
	{
		cservice.setstudent(s);
	}

}
