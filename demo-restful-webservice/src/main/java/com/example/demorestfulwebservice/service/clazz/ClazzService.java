package com.example.demorestfulwebservice.service.clazz;

import com.example.demorestfulwebservice.model.Clazz;
import com.example.demorestfulwebservice.repository.IClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClazzService implements IClazzService{
    @Autowired
    private IClassRepository iClassRepository;
    @Override
    public Page<Clazz> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Clazz> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Clazz clazz) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Iterable<Clazz> findAll() {
        return iClassRepository.findAll();
    }
}
