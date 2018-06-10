package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateUser {


    public static void createUserList() {
        List<User> userList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <= 6; i++) {
            User.Surname surname = getRandomSurname();
            User.Name name = getRandomName();
            userList.add(new User(name, surname, random.nextInt(20) + 20));
        }
    }

    private User.Surname getRandomSurname() {
        Random random = new Random();
        this.User.Surname = User.Surname.values()[random.nextInt(User.Surname.values().length)];
        return this.User.Surname;
    }

    private User.Name getRandomName() {
        Random random = new Random();
        this.User.Name = User.Surname.values()[random.nextInt(User.Name.values().length)];
        return this.User.Surname;
    }
}
