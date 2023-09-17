package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
