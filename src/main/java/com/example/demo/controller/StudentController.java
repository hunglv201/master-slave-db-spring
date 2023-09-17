package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping(path = "/student/{id}")
    public Student getStudent(@PathVariable("id") Long id) {

        return studentService.getStudent(id).orElse(null);
    }

    @GetMapping(path = "/student-v2/{id}")
    public Student getStudentV2(@PathVariable("id") Long id) {

        return studentService.getStudentV2(id).orElse(null);
    }

    @PostMapping(path = "/student")
    public Student createStudent(@RequestBody Student Student) {
        return studentService.createStudent(Student);
    }

    @PostMapping(path = "/student-v2")
    public Student createStudentV2(@RequestBody Student Student) {
        return studentService.createStudentV2(Student);
    }


    @PutMapping(path = "/student")
    public Student updateStudent(@RequestBody Student Student) {
        return studentService.updateStudent(Student);
    }
}
