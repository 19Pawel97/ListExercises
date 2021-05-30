package exercise6registerapp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> marks1 = new ArrayList<>();
        marks1.add(4d);
        marks1.add(3d);
        marks1.add(4.5d);
        Student student1 = new Student(marks1, "235409", "Jan", "Kowalski");

        List<Double> marks2 = new ArrayList<>();
        marks2.add(3d);
        marks2.add(5d);
        marks2.add(4d);
        Student student2 = new Student(marks2, "115409", "Stanisław", "Nowak");

        List<Double> marks3 = new ArrayList<>();
        marks3.add(2d);
        marks3.add(3d);
        marks3.add(3d);
        Student student3 = new Student(marks3, "215408", "Patrycja", "Zając");

        List<Double> marks4 = new ArrayList<>();
        marks4.add(5d);
        marks4.add(3.5d);
        marks4.add(4.5d);
        Student student4 = new Student(marks4, "525439", "Zuzanna", "Mała");

        List<Double> marks5 = new ArrayList<>();
        marks5.add(3.5d);
        marks5.add(2d);
        marks5.add(4.5d);
        Student student5 = new Student(marks5, "135437", "Tomasz", "Skała");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        Register register = new Register(students);

        register.addStudent(student2);
        System.out.println(register.getStudents().toString());
        System.out.println();

        register.addStudents(student3, student4, student5);
        System.out.println(register.getStudents().toString());
        System.out.println();

        register.removeStudent(student5);
        System.out.println(register.getStudents().toString());
        System.out.println();

        register.removeStudent("12413");
        System.out.println();

        register.removeStudents(student1, student4);
        System.out.println(register.getStudents().toString());
        System.out.println();

        register.removeStudent("115409");
        System.out.println(register.getStudents().toString());
        System.out.println();

        register.removeStudent("215408");
        System.out.println(register.getStudents().toString());
        System.out.println();

        register.addStudents(student1, student2, student3, student4, student5);
        System.out.println(register.getStudents().toString());
        System.out.println();

        register.getStudent("123456");
        System.out.println();

        Student theStudent = register.getStudent("235409");
        System.out.println(theStudent);
        System.out.println();

        List<Student> theStudentsNotAll = register.getStudents("025439", "123456", "542310", "678952", "215408");
        for (Student student : theStudentsNotAll) {
            System.out.println(student);
        }
        System.out.println();

        List<Student> theStudents = register.getStudents("235409", "115409", "135437");
        for (Student student : theStudents) {
            System.out.println(student);
        }
        System.out.println();

        register.getStudentsAverage("123456");
        System.out.println();

        Double studentsAverage = register.getStudentsAverage("025439");
        System.out.println(studentsAverage);
        System.out.println();

        List<Student> onTheLineStudents = register.getOnTheLineStudents();
        if (onTheLineStudents.size() == 0) {
            System.out.println("No on the line students :)");
        } else {
            for (Student onTheLineStudent : onTheLineStudents) {
                System.out.println(onTheLineStudent);
            }
        }
        System.out.println();

        List<Student> sortedStudents = register.sortStudentsByIndex();
        for (Student sortedStudent : sortedStudents) {
            System.out.println(sortedStudent);
        }
        System.out.println();

        register.addMark("123456", 4.5d);
        System.out.println();

        register.addMark("235409", 4.5d);
        List<Double> marks = register.getStudent("235409").getMarks();
        System.out.println(marks);
        System.out.println();

        register.addMark(5d, "123456");
        System.out.println();

        register.addMark(5d, "098765", students.get(0).getIndexNum(), students.get(1).getIndexNum(), "135437", "728423");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
