package br.com.javacourse.javaclassestest;

import br.com.javacourse.javaclasses.Student;

public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.setName("John");
        student1.setEnrollment("123456");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setName("Marie");
        student2.setEnrollment("1234567");
        student2.setAge(21);

        Student student3 = new Student();
        student3.init("Louise", "54321", 19);
        System.out.println(student3.getName());
        student1.printStudentData();
        student2.printStudentData();

    }
}
