package com.angeltm.ejercicio1.student;

public class Objeto {
    private Student student;
    private boolean status;
    

    public Objeto(Student student, boolean status) {
        this.student = student;
        this.status = status;
    }
    
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public boolean getstatus() {
        return status;
    }
    public void setstatus(boolean status) {
        this.status = status;
    }
    
}
