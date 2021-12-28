package com.example.demorestfulwebservice.repository;

import com.example.demorestfulwebservice.model.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClassRepository extends JpaRepository<Clazz, Long> {
}
