package ru.plidia.stateapp.entity;


import java.util.List;

import static ru.plidia.stateapp.service.DataGeneration.generateRandomName;

public class City {
    private String name;
    private int populationSize;
    public static final int CITY_NUMBER = 12;
    private List<Citizen> citizenList;

    public City() {
    }

    public City(String name, int populationSize, List<Citizen> citizenList) {
        this.name = generateRandomName(name);
        this.populationSize = populationSize;
        this.citizenList = citizenList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public long getPopulationSize() {
        return populationSize;
    }

    public void setCitizenList(List<Citizen> citizenList) {
        this.citizenList = citizenList;
    }

    public List<Citizen> getCitizenList() {
        return citizenList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("В городе ").append(name).append(" проживает ")
                .append(populationSize)
                .append(" жителей: ").append(citizenList).append("\n");
        return sb.toString();
    }
}
