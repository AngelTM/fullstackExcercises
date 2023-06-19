package com.angeltm.ejercicio1.student;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    public Student insertStudentPredefinied(){
        Student estudiantePredefinido = new Student("Angel","Maestro",25);
        return studentRepository.save(estudiantePredefinido);
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }


}
