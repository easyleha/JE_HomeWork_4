package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    private static Name name;
    private static Surname surname;
    private static int age;
    private static Group group;
    private static List<User> studentList = new ArrayList<>();

    public static void main(String[] args) {

        CreateUser createUser = new CreateUser();
        createUser.createUserList();
        createStudentList();




    }
    public static void createStudentList() {
        Random random = new Random();
        for (int i = 0; i <= 100; i++) {
            studentList.add(new Student(Name.values()[random.nextInt(Name.values().length)],
                    Surname.values()[random.nextInt(Surname.values().length)], random.nextInt(20) + 20));
        }
        Collections.sort(studentList);
        System.out.println("studentList: " + studentList);

    }
}

