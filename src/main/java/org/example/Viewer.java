package org.example;

import java.util.Objects;

public class Viewer {
    private String nickname;
    private int age;
    private int countFilmsWatch;

    public Viewer(String nickname, int age, int countFilmsWatch) {
        this.nickname = nickname;
        this.age = age;
        this.countFilmsWatch = countFilmsWatch;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }


    public int getCountFilmsWatch() {
        return countFilmsWatch;
    }
}
