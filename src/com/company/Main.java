package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CreateUser createUser = new CreateUser();
        createUser.createUserList();


        List<Student> students = new ArrayList<>();
        while(students.size() < 100){

            Student student = new Student();
            if (!students.contains(student)) {
                students.add(student);
            }
        }
        System.out.println(students);
        Collections.sort(students);

        printSpaces();
        System.out.println(students);

    }

    private static void printSpaces() {
        System.out.println();
        System.out.println("=================================================");
        System.out.println();
    }
}

