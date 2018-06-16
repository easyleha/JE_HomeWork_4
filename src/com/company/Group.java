package com.company;

public enum Group{
    JAVA(0), CPP(1), PYTHON(2), QA(3), DESIGN(4), FRONTEND(5);

    int value;
    Group(int value) {
        this.value = value;
    }
}