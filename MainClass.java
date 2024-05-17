package org.example;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Student alex = new Student("alex","Б22-702", 2);
        Student dmitry = new Student("dmitry","Б22-221", 2);
        Student denis = new Student("denis","Б21-702", 3);

        University mephi = new University();

        List<Student> students = new ArrayList<>();
        students.add(alex);
        students.add(denis);
        students.add(dmitry);
        mephi.setStudents(students);

        mephi.printStudents(mephi.getStudents(), 2);
    }
}
