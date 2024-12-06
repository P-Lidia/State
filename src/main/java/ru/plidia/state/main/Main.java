package ru.plidia.state.main;


import ru.plidia.state.entity.*;
import ru.plidia.state.service.PrintRequest;
import ru.plidia.state.util.Menu;
import ru.plidia.state.util.SortingCitizen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Citizen> citizenList = new ArrayList<>();
        for (int i = 0; i < (int) (1000 + Math.random() * 2000); i++) {
            citizenList.add(new Citizen("", "", 34));
        }

        List<City> cityList = new ArrayList<>(10);
        int firstCitizenNum = citizenList.size() / 10;
        int endCitizenNum = firstCitizenNum;
        int i = 0;
        for (int iCity = 0; iCity < 10; iCity++) {
            List<Citizen> citizen = new ArrayList<>();
            while (i < firstCitizenNum && i < citizenList.size()) {
                citizen.add(citizenList.get(i));
                i++;
            }
            cityList.add(new City("", citizen.size(), citizen));
            i = firstCitizenNum;
            firstCitizenNum = firstCitizenNum + endCitizenNum;
        }

        List<District> districtList = new ArrayList<>(5);
        int cityNumber = 0;
        for (int iDist = 0; iDist < 5; iDist++) {
            List<City> cities = new ArrayList<>();
            for (int iCity = cityNumber; iCity <= cityNumber + 1; iCity++) {
                cities.add(cityList.get(iCity));
            }
            districtList.add(new District("", cities.size(), cities));
            cityNumber = cityNumber + 2;
        }

        List<Region> regionList = new ArrayList<>(2);
        int firstDistrictNum = 0;
        int endDistrictNum = 2;
        for (int iReg = 0; iReg < 2; iReg++) {
            List<District> districts = new ArrayList<>();
            for (int iDist = firstDistrictNum; iDist < endDistrictNum; iDist++) {
                districts.add(districtList.get(iDist));
            }
            regionList.add(new Region("", districts.size(), districts));
            firstDistrictNum = firstDistrictNum + 2;
            endDistrictNum = endDistrictNum + 3;
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
