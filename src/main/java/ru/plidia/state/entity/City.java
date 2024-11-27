package ru.plidia.state.entity;


import java.util.List;
import java.util.Random;

public class City {
    private String name;
    private int populationSize;
    private List<Citizen> citizenList;

    public City() {
    }

    public City(String name, int populationSize, List<Citizen> citizenList) {
        this.name = generateName(name);
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

    public String generateName(String name) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 1; i++) {
            sb.append((char) ('A' + random.nextInt(25)));
        }
        for (int i = 1; i < sb.capacity(); i++) {
            sb.append((char) ('a' + random.nextInt(25)));
        }
        return sb.toString();
    }
}

