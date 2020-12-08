package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Viewer {
    private String nickname;
    private int age;
    private Set<Cinema> cinemaSet = new HashSet<>();

    public Viewer(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public void addCinema(Cinema cinema) {
        cinemaSet.add(cinema);
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getCountFilmsWatch() {
        return cinemaSet.size();
    }
}
