package ru.plidia.stateapp.entity;


import java.util.concurrent.atomic.AtomicLong;

public class Citizen {
    private static AtomicLong nextId = new AtomicLong();
    private Long id;
    private String name;
    private String surname;
    private int age;

    public Citizen() {
    }

    public Citizen(String name, String surname, int age) {
        this.id = nextId.incrementAndGet();
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
        return sb
                .append("\n")
                .append(id)
                .append(" - ")
                .append(name)
                .append(" ")
                .append(surname)
                .append(", ")
                .append(age)
                .toString();
    }
}
