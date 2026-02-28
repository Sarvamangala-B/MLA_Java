package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test.entity.Student;
import com.test.service.StudentService;

@RestController
@RequestMapping("/student/v1/api")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(service.saveStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable int id) {
        return new ResponseEntity<>(service.getStudentById(id), HttpStatus.OK);
    }

    @GetMapping("/byteacher/{teacher}")
    public ResponseEntity<List<Student>> getByTeacher(@PathVariable String teacher) {
        return new ResponseEntity<>(service.getStudentsByTeacher(teacher), HttpStatus.OK);
    }

    @GetMapping("/byfees/{feesPaid}")
    public ResponseEntity<List<Student>> getByFees(@PathVariable int feesPaid) {
        return new ResponseEntity<>(service.getStudentsByFeesPaid(feesPaid), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        return new ResponseEntity<>(service.updateStudent(student), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Student>> deleteStudent(@PathVariable int id) {
        return new ResponseEntity<>(service.deleteStudentById(id), HttpStatus.OK);
    }
}