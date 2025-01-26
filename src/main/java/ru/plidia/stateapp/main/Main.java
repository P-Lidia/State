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
        State state = State.getInstance();
        state.setRegion(generation.generateRegionList());
        Capital capital = new Capital(
                state
                        .getRegion()
                        .get(1)
                        .getDistrict()
                        .get(1)
                        .getCity()
                        .get(2)
                        .getName(),
                state
                        .getRegion()
                        .get(1).
                        getDistrict()
                        .get(1)
                        .getCity()
                        .get(2)
                        .getCitizenList());
        state.setCapital(capital);
        Menu menu = new Menu();
        menu.menuChoice(state);
    }
}
