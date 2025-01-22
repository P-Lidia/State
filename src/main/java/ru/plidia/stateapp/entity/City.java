package ru.plidia.stateapp.entity;


import java.util.List;

import static ru.plidia.stateapp.service.DataGeneration.generateRandomName;

public class City {
    private String name;
    private List<Citizen> citizenList;

    public City() {
    }

    public City(String name, List<Citizen> citizenList) {
        this.name = generateRandomName(name);
        this.citizenList = citizenList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
        return sb
                .append("В городе ")
                .append(name)
                .append(" проживает ")
                .append(citizenList.size())
                .append(" жителей: ")
                .append(citizenList)
                .append("\n")
                .toString();
    }
}

