package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentDao;
import com.example.demo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentDao studentDao;

    @Transactional(readOnly = true)
    public Optional<Student> getStudent(Long id) {
        return studentRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public Optional<Student> getStudentV2(Long id) {
        return studentDao.findById(id);
    }

    public Student createStudent(Student Student) {
        return studentRepository.save(Student);
    }

    @Transactional
    public Student createStudentV2(Student Student) {
         return studentDao.save(Student);
    }

    public Student updateStudent(Student Student) {
        return studentRepository.save(Student);
    }
}
