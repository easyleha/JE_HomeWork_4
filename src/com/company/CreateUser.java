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
        User.Surname result;
        Random random = new Random();
        if (random.nextInt(6) == 0) {
            result =  User.Surname.Ivanov;

        }
        if (random.nextInt(6) == 1) {
            result = User.Surname.Sidorov;
        }

        if (random.nextInt(6) == 2) {
            result = User.Surname.Putin;
        }
        if (random.nextInt(6) == 3) {
            result = User.Surname.Coy;
        }

        if (random.nextInt(6) == 4) {
            result = User.Surname.Dorn;
        }
        if (random.nextInt(6) == 5) {
            result = User.Surname.Evremof;
        }
        return result;
    }

    private User.Name getRandomName() {
        User.Name result;
        Random random = new Random();
        if (random.nextInt(6) == 0) {
            result = User.Name.Lesha;
        }
        if (random.nextInt(6) == 1) {
            result = User.Name.Sasha;
        }

        if (random.nextInt(6) == 2) {
            result = User.Name.Anton;
        }
        if (random.nextInt(6) == 3) {
            result = User.Name.Zheka;
        }

        if (random.nextInt(6) == 4) {
            result = User.Name.Nikita;
        }
        if (random.nextInt(6) == 5) {
            result = User.Name.Igor;
        }
        return result;
    }
}
