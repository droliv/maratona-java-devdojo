package br.com.javacourse.javaclasses;

public class Student {
    private String name;
    private String enrollment;
    private int age;

    public Student(){

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // sobrecarga de construtor
    // construtor só pode ser chamado por outro construtor
    public Student(String name, String enrollment, int age){
        this(name, age);
        this.enrollment = enrollment;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEnrollment(String enrollment){
        this.enrollment = enrollment;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getEnrollment(){
        return this.enrollment;
    }

    public int getAge(){
        return this.age;
    }
    public void printStudentData(){
        System.out.println(this.getName());
        System.out.println(this.getEnrollment());
        System.out.println(this.getAge());
    }

    public void init(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Sobrecarga de método
    public void init(String name, String enrollment, int age){
        init(name, age);
        this.enrollment = enrollment;
    }


}
