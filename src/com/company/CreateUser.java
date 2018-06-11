package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CreateUser implements Comparable<User> {

    List<User> userList = new ArrayList<>();
    Surname surname;
    Name name;
    int age;


    public void createUserList() {
        Random random = new Random();
        for (int i = 0; i <= 100; i++) {
            Surname surname = getRandomSurname();
            Name name = getRandomName();
            userList.add(new User(name, surname, random.nextInt(20) + 20));
        }
        Collections.sort(userList);
        System.out.println("userList: " + userList);

    }

    private Surname getRandomSurname() {
        Random random = new Random();
        this.surname = Surname.values()[random.nextInt(Surname.values().length)];
        return surname;

    }

    private Name getRandomName() {
        Random random = new Random();
        this.name = Name.values()[random.nextInt(Name.values().length)];
        return name;
    }


    @Override
    public int compareTo(User o) {
        return 0;
    }
}
