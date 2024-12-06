package ru.plidia.state.entity;

import java.util.List;

import static ru.plidia.state.service.DataGeneration.generateRandomName;

public class District {

    private String name;
    private int cityNumbers;
    private List<City> city;

    public District() {
    }

    public District(String name, int cityNumbers, List<City> city) {
        this.name = generateRandomName(name);
        this.cityNumbers = cityNumbers;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCityNumbers(int cityNumbers) {
        this.cityNumbers = cityNumbers;
    }

    public int getCityNumbers() {
        return cityNumbers;
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
        sb.append("Область -  ").append(name).append(", городов - ")
                .append(cityNumbers).append(": ").append("\n").append(city);
        return sb.toString();
    }
}
