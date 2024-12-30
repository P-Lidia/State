package ru.plidia.stateapp.entity;

import java.util.List;

import static ru.plidia.stateapp.service.DataGeneration.generateRandomName;

public class Region {
    private String name;
    private List<District> district;

    public Region() {
    }

    public Region(String name, List<District> district) {
        this.name = generateRandomName(name);
        this.district = district;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDistrict(List<District> district) {
        this.district = district;
    }

    public List<District> getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Регион - ").append(name)
                .append(", областей -  ").append(getDistrict().size())
                .append(":").append("\n")
                .append(district);
        return sb.toString();
    }
}
