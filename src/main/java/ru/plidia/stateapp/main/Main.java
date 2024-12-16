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
        for (int i = 0, j = 0; i < CITY_NUMBER; i++) {
            cityList.add(new City("",
                    citizenList.size() / CITY_NUMBER,
                    (generation.generateList(citizenList, citizenNum, j))));
            j = citizenNum;
            citizenNum = citizenNum + citizenList.size() / CITY_NUMBER;
        }

        List<District> districtList = new ArrayList<>();
        int citiesNum = cityList.size() / DISTRICT_NUMBER;
        for (int i = 0, j = 0; i < DISTRICT_NUMBER; i++) {
            districtList.add(new District("",
                    cityList.size() / DISTRICT_NUMBER,
                    (generation.generateList(cityList, citiesNum, j))));
            j = citiesNum;
            citiesNum = citiesNum + cityList.size() / DISTRICT_NUMBER;
        }

        List<Region> regionList = new ArrayList<>();
        int districtsNum = districtList.size() / REGION_NUMBER;
        for (int i = 0, j = 0; i < REGION_NUMBER; i++) {
            regionList.add(new Region("",
                    districtList.size() / REGION_NUMBER,
                    (generation.generateList(districtList, districtsNum, j))));
            j = districtsNum;
            districtsNum = districtsNum + districtList.size() / REGION_NUMBER;
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
