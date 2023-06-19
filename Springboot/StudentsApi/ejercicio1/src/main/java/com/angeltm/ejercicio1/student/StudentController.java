package com.angeltm.ejercicio1.student;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/api/student")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping
    @RequestMapping(value = "/agregar")
    public Student addStudentPredef(){
        return studentService.insertStudentPredefinied();
    }

    @PostMapping()
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
    
    @GetMapping()
    public Objeto getStudent(@PathVariable long id){
        Optional<Student> estudiante = studentService.getStudent(id);
        if (estudiante.isPresent()) {
            Objeto respuesta = new Objeto(estudiante.get(),true);
            return respuesta;
        }else{
            Objeto respuesta = new Objeto(null,false);
            return respuesta;
        }
    }

}
