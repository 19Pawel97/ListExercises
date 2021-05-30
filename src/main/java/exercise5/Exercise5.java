package exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {

    // Stwórz klasę Student która posiada pola:
    //nr indeksu
    //imie
    //nazwisko
    //płeć (wartość enum)
    //W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student.
    //Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).
    //a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
    //b. Spróbuj wypisać elementy stosując pętlę foreach
    //c. Wypisz tylko kobiety
    //d. Wypisz tylko mężczyzn
    //e. Wypisz tylko indeksy osób
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("1", "Jan", "Kowalski", Sex.MAN);
        Student student2 = new Student("2", "Tom", "Tomski", Sex.MAN);
        Student student3 = new Student("3", "Paul", "Crane", Sex.MAN);
        Student student4 = new Student("4", "Maria", "Nowak", Sex.WOMAN);
        Student student5 = new Student("5", "Anna", "Polka", Sex.WOMAN);
        Student student6 = new Student("6", "Lucy", "Smith", Sex.WOMAN);

        students.addAll(Arrays.asList(student1,student2,student3,student4,student5,student6));

        System.out.println(students);

        for (Student student : students) {
            System.out.println(student);
        }

        for (Student student : students) {
            if(student.getSex() == Sex.WOMAN) {
                System.out.println(student);
            }
        }

        for (Student student : students) {
            if(student.getSex() == Sex.MAN) {
                System.out.println(student);
            }
        }

        for (Student student : students) {
            System.out.println(student.getIndexId());
        }
    }
}
