package org.example;


import java.util.Random;

enum Subject {
    Geography("география"),
    Russian ("русский язык"),
    English ("английский"),
    Math ("математика"),
    PE ("физкультура");

    private final String label;

    Subject(String label){
        this.label = label;
    }

    String getName(){
        return this.label;
    }
}

public class Teacher {
    String name;
    Subject subject;

    Teacher(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student){
        Random rnd = new Random();
        String mark;
        switch(rnd.nextInt(4)){
            case 0:
                mark = "удовлетворительно";
                break;
            case 1:
                mark = "хорошо";
                break;
            case 2:
                mark = "отлично";
                break;
            default:
                mark = "неудовлетворительно";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s\n",
                this.name, student.name, this.subject.getName(), mark);
    }
}
