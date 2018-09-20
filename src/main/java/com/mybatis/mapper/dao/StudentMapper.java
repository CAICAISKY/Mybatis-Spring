package com.mybatis.mapper.dao;

import com.mybatis.entity.Student;

import java.util.List;

public interface StudentMapper {
    int addStudent(Student student);
    int delStudent(Student student);
    int updateStudent(Student student);
    List<Student> getStudents(Student student);
}
