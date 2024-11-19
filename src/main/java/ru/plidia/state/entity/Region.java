package ru.plidia.state.entity;

import java.util.List;
import java.util.Random;

public class Region {
    private String name;
    private List<District> district;

    public Region() {
    }

    public Region(String name, List<District> district) {
        this.name = name;
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
        sb.append(generateName(name)).append(": ").append(district);
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
}
