package main.java;

public class Teacher extends Person {

    private String teacherId;
    private String specialty;
   
    public Teacher(String name, int age, String teacherId, String specialty) {
        super(name, age);
        this.teacherId = teacherId;
        this.specialty = specialty;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    } 

    public void teach() {
        System.out.println("El profesor " + getName() + " está impartiendo una clase de su especialidad: " + specialty + ".");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("ID Docente: " + teacherId);
        System.out.println("Especialidad: " + specialty);
    }

}