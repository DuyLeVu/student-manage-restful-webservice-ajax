package com.example.demorestfulwebservice.service.student;

import com.example.demorestfulwebservice.model.Student;
import com.example.demorestfulwebservice.service.IGeneralService;

import java.util.List;

public interface IStudentService extends IGeneralService<Student> {
    List<Student> findByNameContaining(String name);
}
