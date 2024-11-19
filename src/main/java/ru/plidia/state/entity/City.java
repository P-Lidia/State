package ru.plidia.state.entity;

import java.util.List;
import java.util.Random;

public class City {
    private String name;
    private int populationSize;
    private List<Citizen> citizen;

    public City() {
    }

    public City(String name, int populationSize, List<Citizen> citizen) {
        this.name = name;
        this.populationSize = populationSize;
        this.citizen = citizen;
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

    public void setCitizen(List<Citizen> citizen) {
        this.citizen = citizen;
    }

    public List<Citizen> getCitizen() {
        return citizen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("В городе").append(generateName(name)).append(" проживает ")
                .append(generatePopulationSize(populationSize))
                .append(" жителей: ").append(citizen.getClass());
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

    static int generatePopulationSize(int populationSize) {
        return populationSize = (int) (Math.random() * 1000);
    }
}
