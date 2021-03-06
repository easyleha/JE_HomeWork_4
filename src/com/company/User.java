package com.company;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

public class User implements Comparable<User> {

    protected Name name;
    protected Surname surname;
    protected int age;
    List<User> userList = new ArrayList<>();



    public User(Name name, Surname surname, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;

    }


    @Override
    public int compareTo(User user) {
        int result = Integer.compare(surname.value, user.surname.value);
        if (result == 0) {
            result = Integer.compare(name.value, user.name.value);
        }
        if (result == 0) {
            result = Integer.compare(age, user.age);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return age == user.age && name == user.name && surname == user.surname;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                surname +
                " " + name +
                ", " + age +
                "}\n";
    }
}
