package br.com.javacourse.javaclassestest;

import br.com.javacourse.javaclasses.Student;

public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "John";
        student1.enrollment = "123456";
        student1.age = 18;

        System.out.println(student1.name);

    }
}
