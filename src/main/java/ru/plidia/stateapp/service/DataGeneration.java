package ru.plidia.stateapp.service;

import ru.plidia.stateapp.entity.Citizen;
import ru.plidia.stateapp.entity.City;
import ru.plidia.stateapp.entity.District;
import ru.plidia.stateapp.entity.Region;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGeneration {
    public List<Region> generateRegionList() {
        List<Region> regionList = new ArrayList<>();
        for (int i = 0; i < (int) (2 + Math.random() * 4); i++) {
            regionList.add(new Region(generateRandomName(), generateDistrictList()));
        }
        return regionList;
    }

    public List<District> generateDistrictList() {
        List<District> districtList = new ArrayList<>();
        for (int i = 0; i < (int) (5 + Math.random() * 3); i++) {
            districtList.add(new District(generateRandomName(), generateCityList()));
        }
        return districtList;
    }

    public List<City> generateCityList() {
        List<City> cityList = new ArrayList<>();
        for (int i = 0; i < (int) (5 + Math.random() * 5); i++) {
            cityList.add(new City(generateRandomName(), generateCitizenList()));
        }
        return cityList;
    }

    public List<Citizen> generateCitizenList() {
        List<Citizen> citizenList = new ArrayList<>();
        for (int i = 0; i < (int) (1000 + Math.random() * 500); i++) {
            citizenList.add(new Citizen(
                    generateRandomName(),
                    generateRandomName(),
                    (int) (Math.random() * 100)));
        }
        return citizenList;
    }

    public String generateRandomName() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append((char) ('A' + random.nextInt(25)));
        int size = 4 + (int) (Math.random() * 6);
        for (int i = 0; i < size; i++) {
            sb.append((char) ('a' + random.nextInt(25)));
        }
        return sb.toString();
    }
}
