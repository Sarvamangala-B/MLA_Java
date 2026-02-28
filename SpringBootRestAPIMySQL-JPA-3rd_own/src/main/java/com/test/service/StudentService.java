package com.test.service;

import java.util.List;
import java.util.Optional;

import com.test.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    Optional<Student> getStudentById(int id);

    Student updateStudent(Student student);

    List<Student> deleteStudentById(int id);

    List<Student> getAllStudents();

    List<Student> getStudentsByTeacher(String teacher);

    List<Student> getStudentsByFeesPaid(int feesPaid);
}