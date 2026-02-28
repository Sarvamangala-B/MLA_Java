package com.test.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
@Schema
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

    private String name;
    private String teacher;
    private int feesPaid;
    private String school;

    public Student() {}

    public Student(int id, String name, String teacher, int feesPaid, String school) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.feesPaid = feesPaid;
        this.school = school;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTeacher() { return teacher; }
    public void setTeacher(String teacher) { this.teacher = teacher; }

    public int getFeesPaid() { return feesPaid; }
    public void setFeesPaid(int feesPaid) { this.feesPaid = feesPaid; }

    public String getSchool() { return school; }
    public void setSchool(String school) { this.school = school; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", teacher=" + teacher +
                ", feesPaid=" + feesPaid + ", school=" + school + "]";
    }
}