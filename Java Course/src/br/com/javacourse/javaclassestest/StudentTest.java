package br.com.javacourse.javaclassestest;

import br.com.javacourse.javaclasses.Student;

public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "John";
        student1.enrollment = "123456";
        student1.age = 18;

        Student student2 = new Student();
        student2.name = "Marie";
        student2.enrollment = "1234567";
        student2.age = 21;

        System.out.println(student1.name);
        student1.printStudentData();
        student2.printStudentData();

    }
}
