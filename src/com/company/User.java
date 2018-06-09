package com.company;

public class User {

    public enum Name {Lesha, Sasha, Anton, Zheka, Nikita, Igor };

    public enum Surname {Ivanov, Sidorov, Putin, Coy, Dorn, Evremof}

    private Name name;
    private Surname surname;
    private int age;

    public User(int age) {
        this.age = age;
    }

    public User(Name name, Surname surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public Surname getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "n:" + name +
                ", s:" + surname +
                ", a:" + age +
                '}';
    }
}
