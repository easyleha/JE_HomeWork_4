package com.company;

public enum Surname {
    Ivanov(0), Sidorov(1), Putin(2), Coy(3), Dorn(4), Evremof(5);

    int value;
    Surname(int value) {
        this.value = value;
    }
}