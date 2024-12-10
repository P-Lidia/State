package ru.plidia.stateapp.main;


import ru.plidia.stateapp.entity.*;
import ru.plidia.stateapp.service.DataGeneration;
import ru.plidia.stateapp.service.PrintRequest;
import ru.plidia.stateapp.util.Menu;
import ru.plidia.stateapp.util.SortingCitizen;

import java.util.ArrayList;
import java.util.List;

import static ru.plidia.stateapp.entity.City.CITY_NUMBER;
import static ru.plidia.stateapp.entity.District.DISTRICT_NUMBER;
import static ru.plidia.stateapp.entity.Region.REGION_NUMBER;

public class Main {
    public static void main(String[] args) {
        List<Citizen> citizenList = new ArrayList<>();
        for (int i = 0; i < (int) (2000 + Math.random() * 500); i++) {
            citizenList.add(new Citizen("", "", 34));
        }

        DataGeneration generation = new DataGeneration();
        List<City> cityList = new ArrayList<>();
        int citizenNum = citizenList.size() / CITY_NUMBER;
        int firstCitizen = 0;
        int endCitizen = citizenNum;
        for (int i = 0; i < 12; i++) {
            List<Citizen> citizens = generation.generateList(citizenList, firstCitizen, citizenNum);
            cityList.add(new City("", citizens.size(), citizens));
            firstCitizen = citizenNum;
            citizenNum = citizenNum + endCitizen;
        }

        List<District> districtList = new ArrayList<>();
        int citiesNum = cityList.size() / DISTRICT_NUMBER;
        int firstCity = 0;
        int endCity = citiesNum;
        for (int i = 0; i < 6; i++) {
            List<City> cities = generation.generateList(cityList, firstCity, citiesNum);
            districtList.add(new District("", cities.size(), cities));
            firstCity = citiesNum;
            citiesNum = citiesNum + endCity;
        }

        List<Region> regionList = new ArrayList<>();
        int districtsNum = districtList.size() / REGION_NUMBER;
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
