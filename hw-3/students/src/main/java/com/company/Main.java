package com.company;

import com.company.students.Aspirant;
import com.company.students.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Aspirant("Ваня", "Петров", "101б", 4.2, "исследование чего-то там");
        System.out.printf("Стипендия Вани Петрова: %d\n", student.calculateGrants());

        Student[] students = new Student[2];
        students[0] = new Student("Петя", "Иванов", "302а", 4.1);
        students[1] = new Aspirant("Петя", "Иванов", "302а", 4.1, "Самая лучшая работа");

        System.out.printf("Стипендия студента Вани Петрова: %d\n", students[0].calculateGrants());
        System.out.printf("Стипендия аспиранта Вани Петрова: %d\n", students[1].calculateGrants());
    }
}