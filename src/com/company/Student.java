package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Student extends User {



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
            studentList.add(new Student(Name.values()[random.nextInt(Name.values().length)],
                    Surname.values()[random.nextInt(Surname.values().length)],
                    random.nextInt(20) + 20));
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
