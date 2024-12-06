package ru.plidia.state.entity;

import java.util.List;

import static ru.plidia.state.service.DataGeneration.generateRandomName;

public class Region {
    private String name;
    private int districtNumbers;
    private List<District> district;

    public Region() {
    }

    public Region(String name, int districtNumbers, List<District> district) {
        this.name = generateRandomName(name);
        this.districtNumbers = districtNumbers;
        this.district = district;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDistrictNumbers(int districtNumbers) {
        this.districtNumbers = districtNumbers;
    }

    public int getDistrictNumbers() {
        return districtNumbers;
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
        sb.append("Регион - ").append(name).append(", областей -  ")
                .append(districtNumbers).append(":").append("\n")
                .append(district);
        return sb.toString();
    }
}
