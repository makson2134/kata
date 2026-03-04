package org.example;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Абобусов Василий Иванович", Subject.Russian);
        Student student = new Student("Петров Пётр Петрович");

        teacher.evaluate(student);
    }
}