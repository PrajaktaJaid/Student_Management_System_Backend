package com.stud.service;

import com.stud.model.Student;
import com.stud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public List<Student> searchStudents(String name) {
        return repository.findByNameContaining(name);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student student = repository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        student.setName(updatedStudent.getName());
        student.setAge(updatedStudent.getAge());
        student.setStudentClass(updatedStudent.getStudentClass());
        student.setPhoneNumber(updatedStudent.getPhoneNumber());
        return repository.save(student);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
