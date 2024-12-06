package ru.plidia.state.main;


import ru.plidia.state.entity.*;
import ru.plidia.state.service.DataGeneration;
import ru.plidia.state.service.PrintRequest;
import ru.plidia.state.util.Menu;
import ru.plidia.state.util.SortingCitizen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Citizen> citizenList = new ArrayList<>();
        for (int i = 0; i < (int) (2000 + Math.random() * 500); i++) {
            citizenList.add(new Citizen("", "", 34));
        }

        DataGeneration generation = new DataGeneration();
        List<City> cityList = new ArrayList<>(12);
        int citizenNum = citizenList.size() / 12;
        int firstCitizen = 0;
        int endCitizen = citizenNum;
        for (int i = 0; i < 12; i++) {
            List<Citizen> citizens = generation.generateList(citizenList, firstCitizen, citizenNum);
            cityList.add(new City("", citizens.size(), citizens));
            firstCitizen = citizenNum;
            citizenNum = citizenNum + endCitizen;
        }

        List<District> districtList = new ArrayList<>(6);
        int citiesNum = cityList.size() / 6;
        int firstCity = 0;
        int endCity = citiesNum;
        for (int i = 0; i < 6; i++) {
            List<City> cities = generation.generateList(cityList, firstCity, citiesNum);
            districtList.add(new District("", cities.size(), cities));
            firstCity = citiesNum;
            citiesNum = citiesNum + endCity;
        }

        List<Region> regionList = new ArrayList<>(3);
        int districtsNum = districtList.size() / 3;
        int firstDistrict = 0;
        int endDistrict = districtsNum;
        for (int i = 0; i < 3; i++) {
            List<District> districts = generation.generateList(districtList, firstDistrict, districtsNum);
            regionList.add(new Region("", districts.size(), districts));
            firstDistrict = districtsNum;
            districtsNum = districtsNum + endDistrict;
        }

        Capital capital = new Capital();
        capital.setName(cityList.get(2).getName());
        capital.setPopulationSize(cityList.get(2).getCitizenList().size());
        capital.setCitizen(cityList.get(2).getCitizenList());
        State state = State.getInstance();
        state.setCapital(capital);
        state.setRegion(regionList);
        state.setCitizen(citizenList);
        SortingCitizen sorting = new SortingCitizen();
        PrintRequest request = new PrintRequest();
        Menu menu = new Menu();
        menu.menuChoice(sorting, request, state);
    }
}
