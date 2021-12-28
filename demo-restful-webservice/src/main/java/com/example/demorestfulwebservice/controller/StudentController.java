package com.example.demorestfulwebservice.controller;

import com.example.demorestfulwebservice.model.Student;
import com.example.demorestfulwebservice.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public ResponseEntity<Page<Student>> findAll(Pageable pageable) {
        return new ResponseEntity<>(studentService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student) {
        studentService.save(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id) {
        Optional<Student> student = studentService.findById(id);
        if (!student.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student.get(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
        Optional<Student> student1 = studentService.findById(id);
        student.setId(student1.get().getId());
        studentService.save(student);
        return new ResponseEntity<>(student1.get(), HttpStatus.OK);
    }
}
