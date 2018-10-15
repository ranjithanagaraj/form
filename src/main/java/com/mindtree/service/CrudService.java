package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.entity.Student;
import com.mindtree.repository.StudentRepository;


@Service
public class CrudService {
	
	@Autowired
	private StudentRepository srepo;
	
	public List<Student>  printstudent()
	{
		return srepo.findAll();
	}
	
	public void setstudent(Student s)
	{
		srepo.save(s);
	}

}
