package com.example.demo.repository;

import com.example.demo.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.Optional;

@Component
@AllArgsConstructor
public class StudentDao {
    private final EntityManager entityManager;


    public Optional<Student> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Student.class, id));
    }

    public Student save(Student s) {
        entityManager.persist(s);
        return s;
    }
}
