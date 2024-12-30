package ru.plidia.stateapp.entity;

import java.util.List;

public class Capital {
    private String name;
    private List<Citizen> citizen;

    public Capital() {
    }

    public Capital(String name, List<Citizen> citizen) {
        this.name = name;
        this.citizen = citizen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
        sb.append("Столица нашего государства - ").append(name).append(". Население столицы ")
                .append(getCitizen().size()).append(" человек:")
                .append("\n").append(citizen).append("\n");
        return sb.toString();
    }
}
