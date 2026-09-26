package main.java;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String code;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Course(String code, String name, Teacher teacher) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>(); 
    }  
     public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
            System.out.println("Estudiante " + student.getName() + " agregado al curso " + name + ".");
        }
    }

    public void showCourseDetails() {
        System.out.println("========================================");
        System.out.println("CURSO: " + name + " (Código: " + code + ")");
        System.out.println("========================================");
        
        System.out.println("DOCENTE ASIGNADO:");
        if (teacher != null) {
            teacher.showInformation();
        } else {
            System.out.println("No hay un docente asignado aún.");
        }

        System.out.println("----------------------------------------");
        System.out.println("LISTA DE ESTUDIANTES INSCRITOS (" + students.size() + "):");
        
        if (students.isEmpty()) {
            System.out.println("No hay estudiantes inscritos en este curso.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println("\n[Estudiante #" + (i + 1) + "]");
                students.get(i).showInformation();
            }
        }
        System.out.println("========================================\n");
    }

   
}