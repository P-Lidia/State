package ru.plidia.stateapp.main;


import ru.plidia.stateapp.entity.Capital;
import ru.plidia.stateapp.entity.District;
import ru.plidia.stateapp.entity.Region;
import ru.plidia.stateapp.entity.State;
import ru.plidia.stateapp.service.DataGeneration;
import ru.plidia.stateapp.util.Menu;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        DataGeneration generation = new DataGeneration();
        List<Region> regionList = new ArrayList<>();
        for (int i = 0; i < (int) (2 + Math.random() * 4); i++) {
            regionList.add(new Region("", generation.generateDistrictList(new District())));
        }
        Capital capital = new Capital(
                regionList
                        .get(1)
                        .getDistrict()
                        .get(1)
                        .getCity()
                        .get(2)
                        .getName(),
                regionList
                        .get(1).
                        getDistrict()
                        .get(1)
                        .getCity()
                        .get(2)
                        .getCitizenList());
        State state = State.getInstance();
        state.setCapital(capital);
        state.setRegion(regionList);
        Menu menu = new Menu();
        menu.menuChoice(state);
    }
}
