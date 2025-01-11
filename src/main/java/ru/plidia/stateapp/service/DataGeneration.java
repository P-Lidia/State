package ru.plidia.stateapp.service;

import ru.plidia.stateapp.entity.Citizen;
import ru.plidia.stateapp.entity.City;
import ru.plidia.stateapp.entity.District;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGeneration {
    public List<District> generateDistrictList(Object o) {
        List<District> districtList = new ArrayList<>();
        for (int i = 0; i < (int) (5 + Math.random() * 3); i++) {
            districtList.add(new District("",
                    generateCityList(new City())));
        }
        return districtList;
    }

    public List<City> generateCityList(Object o) {
        List<City> cityList = new ArrayList<>();
        for (int i = 0; i < (int) (5 + Math.random() * 5); i++) {
            cityList.add(new City("",
                    generateCitizenList(new Citizen())));
        }
        return cityList;
    }

    public List<Citizen> generateCitizenList(Object o) {
        List<Citizen> citizenList = new ArrayList<>();
        for (int i = 0; i < (int) (1000 + Math.random() * 500); i++) {
            citizenList.add(new Citizen("", "", 34));
        }
        return citizenList;
    }

    public static String generateRandomName(String name) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append((char) ('A' + random.nextInt(25)));
        int size = 4 + (int) (Math.random() * 6);
        for (int i = 0; i < size; i++) {
            sb.append((char) ('a' + random.nextInt(25)));
        }
        return sb.toString();
    }

    public static int generateRandomAge(int age) {
        return (int) (Math.random() * 100);
    }
}
