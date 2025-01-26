package ru.plidia.stateapp.main;


import ru.plidia.stateapp.entity.Capital;
import ru.plidia.stateapp.entity.State;
import ru.plidia.stateapp.service.DataGeneration;
import ru.plidia.stateapp.util.Menu;


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
