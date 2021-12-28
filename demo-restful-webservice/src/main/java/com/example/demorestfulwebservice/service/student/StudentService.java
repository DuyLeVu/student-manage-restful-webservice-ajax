package com.example.demorestfulwebservice.service.student;

import com.example.demorestfulwebservice.model.Student;
import com.example.demorestfulwebservice.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService implements IStudentService{

    @Autowired
    private IStudentRepository iStudentRepository;

    @Override
    public Page<Student> findAll(Pageable pageable) {
        pageable = PageRequest.of(0,10, Sort.by("score"));
        return iStudentRepository.findAll(pageable);
    }

    @Override
    public Optional<Student> findById(Long id) {
       return iStudentRepository.findById(id);
    }

    @Override
    public void save(Student student) {
        iStudentRepository.save(student);
    }

    @Override
    public void remove(Long id) {
        iStudentRepository.deleteById(id);
    }

    @Override
    public Iterable<Student> findAll() {
        return null;
    }

    @Override
    public List<Student> findByNameContaining(String name) {
        return iStudentRepository.findByNameContaining(name);
    }
}
