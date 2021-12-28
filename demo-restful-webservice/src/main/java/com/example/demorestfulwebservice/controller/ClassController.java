package com.example.demorestfulwebservice.controller;

import com.example.demorestfulwebservice.model.Clazz;
import com.example.demorestfulwebservice.model.Student;
import com.example.demorestfulwebservice.service.clazz.ClazzService;
import com.example.demorestfulwebservice.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/classes")
public class ClassController {
    @Autowired
    ClazzService clazzService;

    @GetMapping
    public ResponseEntity<Iterable<Clazz>> findAll() {
        Iterable<Clazz> classes = clazzService.findAll();
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }
}
