package main.java;

public class Student extends Person{

    private String studentId;
    private String career;

    public Student(String name, int age, String studentId, String career) {
        super(name,age);
        this.studentId = studentId;
        this.career = career;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    
    public void enroll() {
        System.out.println("El estudiante " + getName() + " se ha matriculado en la carrera de " + career + ".");
    }

    @Override
    public void showInformation() {
        super.showInformation(); // Muestra el nombre y la edad
        System.out.println("ID Estudiante: " + studentId);
        System.out.println("Carrera: " + career);
    }
}
