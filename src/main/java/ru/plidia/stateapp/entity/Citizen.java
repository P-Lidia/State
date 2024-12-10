package ru.plidia.stateapp.entity;


import java.util.concurrent.atomic.AtomicInteger;

import static ru.plidia.stateapp.service.DataGeneration.generateRandomAge;
import static ru.plidia.stateapp.service.DataGeneration.generateRandomName;

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
        this.name = generateRandomName(name);
        this.surname = generateRandomName(surname);
        this.age = generateRandomAge(age);
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
}
