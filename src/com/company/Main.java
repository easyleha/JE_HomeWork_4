package com.company;


public class Main {

    private static Name name;
    private static Surname surname;
    private static int age;
    private static Student.Group group;

    public static void main(String[] args) {

        CreateUser createUser = new CreateUser();
        createUser.createUserList();

        Student student = new Student(CreateUser.super(group, name, surname, age));
        student.createStudentList();


    }
}

