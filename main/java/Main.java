package main.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   PRÁCTICA 4 — PROGRAMACIÓN ORIENTADA A OBJETOS  ");
        System.out.println("==================================================\n");

        System.out.println(">>> 1. PRUEBA DE HERENCIA (Person, Student, Teacher)\n");

        Teacher teacher1 = new Teacher("Dr. Alan Turing", 42, "T-1001", "Ciencias de la Computación");
        System.out.println("--- Información del Docente ---");
        teacher1.showInformation();
        teacher1.teach();
        System.out.println();

        Student student1 = new Student("Carlos Mendoza", 20, "SIS001", "Ingeniería de Sistemas");
        Student student2 = new Student("Ana Gómez", 21, "SIS002", "Ingeniería de Sistemas");
        Student student3 = new Student("Luis Paredes", 22, "SIS003", "Ingeniería de Sistemas");

        System.out.println("--- Información del Estudiante 1 ---");
        student1.showInformation();
        student1.enroll();
        System.out.println();

        System.out.println(">>> 2. PRUEBA DE AGREGACIÓN Y COLECCIONES (Course - List<Student>)\n");

        Course course1 = new Course("SIS-211", "Técnicas de Programación II", teacher1);

        System.out.println("Inscribiendo estudiantes al curso...");
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        System.out.println();

        course1.showCourseDetails();
        System.out.println(">>> 3. PRUEBA DE COMPOSICIÓN (Car y Engine)\n");

        Car car1 = new Car("Toyota", "Corolla Cross", "V6 Híbrido", 200);

        System.out.println("--- Detalles del Vehículo ---");
        car1.showInformation();

        System.out.println("--- Encendido del Vehículo ---");
        car1.startCar();
        System.out.println();

        System.out.println("==================================================");
        System.out.println("   EJECUCIÓN COMPLETADA CON ÉXITO                  ");
        System.out.println("==================================================");
    }
}