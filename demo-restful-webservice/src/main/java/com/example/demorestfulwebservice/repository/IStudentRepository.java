package com.example.demorestfulwebservice.repository;

import com.example.demorestfulwebservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

}
