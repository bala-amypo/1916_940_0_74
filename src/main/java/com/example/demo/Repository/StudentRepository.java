package com.example.aiml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.
import com.example.aiml.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    
    }