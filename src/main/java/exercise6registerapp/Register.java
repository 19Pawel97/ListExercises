package exercise6registerapp;

import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class Register {
    private List<Student> students;

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void removeStudent(String studentsIndex) {
        List<String> studentsIndexes = new ArrayList<>();
        for (Student student : students) {
            studentsIndexes.add(student.getIndexNum());
        }
        if (!studentsIndexes.contains(studentsIndex)) {
            System.out.println("There is no student with such index number in the register!");
        } else {
            for (Iterator<Student> it = students.iterator(); it.hasNext(); ) {
                Student next = it.next();
                if (next.getIndexNum().equals(studentsIndex))
                    it.remove();
            }
        }
    }

    public Student getStudent(String studentsIndex) {
        Student theStudent = null;
        int counter = 0;
        for (Student student : students) {
            if (!student.getIndexNum().equals(studentsIndex)) {
                counter++;
            } else {
                theStudent = student;
            }
        }
        if (counter == students.size()) {
            System.out.println("No student with such index!");
        }
        return theStudent;
    }

    public Double getStudentsAverage(String studentsIndex) {
        Student theStudent = new Student();
        Double average = 0d;
        int counter = 0;
        for (Student student : students) {
            if (!student.getIndexNum().equals(studentsIndex)) {
                counter++;
            } else {
                theStudent = student;
            }
        }
        if (counter == students.size()) {
            System.out.println("No student with such index number!");
        }
        try {
            List<Double> theStudentsMarks = theStudent.getMarks();
            Double sum = 0d;
            for (Double theStudentsMark : theStudentsMarks) {
                sum += theStudentsMark;
            }
            average = sum / theStudentsMarks.size();
        } catch (NullPointerException e) {
            e.toString();
        }
        return average;
    }

    public List<Student> getOnTheLineStudents() {
        List<Student> OnTheLineStudents = new ArrayList<>();

        for (Student student : students) {
            List<Double> theStudentsMarks = student.getMarks();
            Double sum = 0d;
            for (Double theStudentsMark : theStudentsMarks) {
                sum += theStudentsMark;
            }
            Double average = sum / theStudentsMarks.size();
            if (average < 3) {
                OnTheLineStudents.add(student);
            }
        }
        return OnTheLineStudents;
    }

    public List<Student> sortStudentsByIndex() {
        List<String> indexes = new ArrayList<>();
        for (Student student : students) {
            indexes.add(student.getIndexNum());
        }
        List<Integer> indexesInt = new ArrayList<>();
        for (String index : indexes) {
            indexesInt.add(Integer.parseInt(index));
        }
        Collections.sort(indexesInt);
        List<Student> sortedStudents = new ArrayList<>();
        for (int i = 0; i < indexesInt.size(); i++) {
            sortedStudents.add(this.getStudent(String.valueOf(indexesInt.get(i))));
        }
        return sortedStudents;
    }

    public void addMark(String indexNum, Double mark) {
        int counter = 0;
        for (Student student : students) {
            if (student.getIndexNum().equals(indexNum)) {
                student.getMarks().add(mark);
            } else {
                counter++;
            }
        }
        if (counter == students.size()) {
            System.out.println("No student with such index number! No mark added.");
        }
    }

    public void addStudents(Student... AddedStudents) {
        List<Student> studentList = Arrays.asList(AddedStudents);
        for (Student AddedStudent : studentList) {
            students.add(AddedStudent);
        }
    }

    public void removeStudents(Student... RemovedStudents) {
        List<Student> studentList = Arrays.asList(RemovedStudents);
        for (Student removedStudent : studentList) {
            students.remove(removedStudent);
        }
    }

    public List<Student> getStudents(String... studentsIndexes) {
        List<String> theStudentsIndexes = Arrays.asList(studentsIndexes);
        List<Student> theStudents = new ArrayList<>();
        int[] counters = new int[theStudentsIndexes.size()];
        for (int i = 0; i < theStudentsIndexes.size(); i++) {
            for (Student student : students) {
                if (!student.getIndexNum().equals(theStudentsIndexes.get(i))) {
                    counters[i]++;
                } else {
                    theStudents.add(student);
                }
            }
        }
        for (int i = 0; i < theStudentsIndexes.size(); i++) {
            if (counters[i] == students.size()) {
                System.out.println(theStudentsIndexes.get(i) + " - no student with such index number in the register!");
            }
        }
        return theStudents;
    }

    public void addMark(Double mark, String... indexNums) {
        List<String> theStudentsIndexes = Arrays.asList(indexNums);
        int[] counters = new int[theStudentsIndexes.size()];
        for (int i = 0; i < theStudentsIndexes.size(); i++) {
            for (Student student : students) {
                if (!student.getIndexNum().equals(theStudentsIndexes.get(i))) {
                    counters[i]++;
                } else {
                    student.getMarks().add(mark);
                }
            }
        }
        for (int i = 0; i < theStudentsIndexes.size(); i++) {
            if (counters[i] == students.size()) {
                System.out.println(theStudentsIndexes.get(i) + " - no student with such index number, no mark added.");
            }
        }


    }

}
