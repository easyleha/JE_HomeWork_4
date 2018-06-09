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
        if (random.nextInt(6) == 0) {
            return User.Surname.Ivanov;
        }
        if (random.nextInt(6) == 1) {
            return User.Surname.Sidorov;
        }

        if (random.nextInt(6) == 2) {
            return User.Surname.Putin;
        }
        if (random.nextInt(6) == 3) {
            return User.Surname.Coy;
        }

        if (random.nextInt(6) == 4) {
            return User.Surname.Dorn;
        }
        if (random.nextInt(6) == 5) {
            return User.Surname.Evremof;
        }
    }

    private User.Name getRandomName() {
        Random random = new Random();
        if (random.nextInt(6) == 0) {
            return User.Name.Lesha;
        }
        if (random.nextInt(6) == 1) {
            return User.Name.Sasha;
        }

        if (random.nextInt(6) == 2) {
            return User.Name.Anton;
        }
        if (random.nextInt(6) == 3) {
            return User.Name.Zheka;
        }

        if (random.nextInt(6) == 4) {
            return User.Name.Nikita;
        }
        if (random.nextInt(6) == 5) {
            return User.Name.Igor;
        }
    }
}
