package ru.plidia.stateapp.entity;

import java.util.List;

import static ru.plidia.stateapp.service.DataGeneration.generateRandomName;

public class District {
    private String name;
    private List<City> city;

    public District() {
    }

    public District(String name, List<City> city) {
        this.name = generateRandomName(name);
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
        return sb
                .append("Область -  ")
                .append(name)
                .append(", городов - ")
                .append(getCity().size())
                .append(": ")
                .append("\n")
                .append(city)
                .toString();
    }
}
