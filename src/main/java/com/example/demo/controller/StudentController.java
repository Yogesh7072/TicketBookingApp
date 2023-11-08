package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class StudentController {

	@GetMapping(value = "/students/{id}", produces = { "application/json", "application/xml" })
	public Student getStudent(@PathVariable Long id) {

		return null;
	}

	@PostMapping(value = "/savesStu", produces = { "application/json", "application/xml" }, consumes = {
			"application/json", "application/xml" })
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		System.out.println("run");
		Student st = student;
		return new ResponseEntity<Student>(st, HttpStatus.CREATED);

	}

	@PutMapping(value = "/students/{id}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {

		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	@DeleteMapping(value = "/students/{id}")
	public void deleteStudent(@PathVariable Long id) {

	}
}
