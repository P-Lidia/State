package ru.plidia.state.entity;

import java.util.List;

public class Capital {
    private String name;
    private int populationSize;
    private List<Citizen> citizen;

    public Capital() {
    }

    public Capital(String name, int populationSize, List<Citizen> citizen) {
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

    public int getPopulationSize() {
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
        sb.append("Столица - ").append(name).append(". Население столицы ")
                .append(populationSize).append(" человек:")
                .append("\n").append(citizen);
        return sb.toString();
    }
}
