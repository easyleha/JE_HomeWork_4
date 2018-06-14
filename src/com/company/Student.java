package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Student extends User {

    public enum Group{
        JAVA(0), CPP(1), PYTHON(2), QA(3), DESIGN(4), FRONTEND(5);

        int value;
        Group(int value) {
            this.value = value;
        }
    }


    List<User> studentList = new ArrayList<>();
    public Group group;
    private static Random random = new Random();


    public Student(Name name, Surname surname, int age) {
        super(name, surname, age);
        new CreateUser();
        this.group = Group.values()[random.nextInt(Group.values().length)];
    }

    public void createStudentList() {
        Random random = new Random();
        for (int i = 0; i <= 100; i++) {
            userList.add(new Student(name, surname, random.nextInt(20) + 20));
        }
        Collections.sort(studentList);
        System.out.println("studentList: " + studentList);

    }

    @Override
    public int compareTo(User user) {
        int result = 0;
        if(user instanceof Student) {
            result = Integer.compare(group.value, ((Student) user).group.value);
            if(result == 0) {
                result = super.compareTo(user);
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return group == student.group;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group = " + group +
                ", " + surname +
                " " + name +
                ", " + age +
                " years old}\n";
    }
}
