package ru.plidia.state.entity;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Citizen {
    static AtomicInteger nextId = new AtomicInteger();
    private Long id;
    private String name;
    private String surname;
    private int age;

    public Citizen() {
    }

    public Citizen(String name, String surname, int age) {
        this.id = (long) nextId.incrementAndGet();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append((long) nextId.incrementAndGet()).append(" - ").append(generateNameSurname(name))
                .append(" ").append(generateNameSurname(surname)).append(", ").append(generateAge(age));
        return sb.toString();
    }

    public static String generateNameSurname(String name) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < sb.capacity(); i++) {
            sb.append((char) ('a' + random.nextInt(25)));
        }
        return sb.toString();
    }

    int generateAge(int age) {
        return age = (int) (Math.random() * 100);
    }
}
