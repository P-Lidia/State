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
        id = (long) nextId.incrementAndGet();
        name = generateName(name);
        surname = generateSurname(surname);
        age = generateAge(age);
    }

    public Citizen(String name, String surname, int age) {
        this.id = (long) nextId.incrementAndGet();
        this.name = generateName(name);
        this.surname = generateSurname(surname);
        this.age = generateAge(age);
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
        sb.append("\n").append(id).append(" - ").append(name)
                .append(" ").append(surname).append(", ").append(age);
        return sb.toString();
    }

    public String generateSurname(String surname) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 1; i++) {
            sb.append((char) ('A' + random.nextInt(25)));
        }
        for (int i = 1; i < sb.capacity(); i++) {
            sb.append((char) ('a' + random.nextInt(25)));
        }
        return sb.toString();
    }

    public String generateName(String name) {
        Random random = new Random();
        int capacity = 5 + (int) (Math.random() * 5);
        StringBuilder sb = new StringBuilder(capacity);
        for (int i = 0; i < 1; i++) {
            sb.append((char) ('A' + random.nextInt(25)));
        }
        for (int i = 1; i < sb.capacity(); i++) {
            sb.append((char) ('a' + random.nextInt(25)));
        }
        return sb.toString();
    }

    int generateAge(int age) {
        return (int) (Math.random() * 100);
    }


}
