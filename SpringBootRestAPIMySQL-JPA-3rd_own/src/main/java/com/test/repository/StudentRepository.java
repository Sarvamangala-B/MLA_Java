package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByName(String name);

    List<Student> findByTeacher(String teacher);

    List<Student> findBySchool(String school);

    List<Student> findByFeesPaid(int feesPaid);
}