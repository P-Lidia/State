package ru.plidia.state.entity;

import java.util.List;
import java.util.Random;

public class District {

    private String name;
    private List<City> city;

    public District() {
    }

    public District(String name, List<City> city) {
        this.name = name;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }

    public List<City> getCity() {
        return city;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(generateName(name)).append(": ").append(city);
        return sb.toString();
    }

    public static String generateName(String name) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < sb.capacity(); i++) {
            sb.append((char) ('a' + random.nextInt(25)));
        }
        return sb.toString();
    }
}
