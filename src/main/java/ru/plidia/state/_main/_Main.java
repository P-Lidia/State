package ru.plidia.state._main;


import ru.plidia.state.entity.*;
import ru.plidia.state.service.RandomGeneration;

import java.util.ArrayList;
import java.util.List;

public class _Main {
    public static void main(String[] args) {
        RandomGeneration generation = new RandomGeneration();
        Citizen citizen = new Citizen();
        List<Citizen> citizens = new ArrayList<>();
        int count = generation.generateCitizenNumbers();
        for(int i = 0; i <= count; i++) {
            citizens.add(citizen);
        }
        City city = new City("Asdsds", citizens.size(), citizens);
        List<City> cities = new ArrayList<>();
        count = generation.generateCityNumbers() ;
        for(int i = 0; i <= count; i++) {
            cities.add(city);
        }
        District district = new District("Sfdfdf",cities.size(), cities);
        List<District> districts = new ArrayList<>();
        count = generation.generateDistrictNumbers();
        for(int i = 0; i <= count; i++) {
            districts.add(district);
        }
        Region region = new Region("Ysdfc", districts.size(), districts);
        List<Region> regions = new ArrayList<>();
        count = generation.generateRegionNumbers();
        for(int i = 0; i <= count; i++) {
            regions.add(region);
        }
        Capital capital = new Capital("Capital",citizens.size(), citizens);
        State.getInstance(regions, capital);







    }
}
