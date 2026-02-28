package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StudentDao;
import com.test.entity.Student;
import com.test.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    @Override
    public Student saveStudent(Student student) {
        return dao.saveStudent(student);
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return dao.getStudentById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    @Override
    public List<Student> deleteStudentById(int id) {
        return dao.deleteStudentById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    @Override
    public List<Student> getStudentsByTeacher(String teacher) {
        return dao.getStudentsByTeacher(teacher);
    }

    @Override
    public List<Student> getStudentsByFeesPaid(int feesPaid) {
        return dao.getStudentsByFeesPaid(feesPaid);
    }
}