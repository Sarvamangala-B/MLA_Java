package com.test.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.StudentDao;
import com.test.entity.Student;
import com.test.repository.StudentRepository;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return repository.findById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> deleteStudentById(int id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public List<Student> getStudentsByTeacher(String teacher) {
        return repository.findByTeacher(teacher);
    }

    @Override
    public List<Student> getStudentsByFeesPaid(int feesPaid) {
        return repository.findByFeesPaid(feesPaid);
    }
}