package ru.plidia.state.service;

import ru.plidia.state.entity.State;

public class PrintRequest {
    public void printCapital(State state) {
        System.out.println(state.getCapital());
    }

    public void printRegionNumber(State state) {
        System.out.println("Количество областей :" + state.getRegion().size());
    }

    public void printStateArea(State state) {
        System.out.println("Площадь государства составляет " + state.STATEAREA);
    }

    public static void printSortResult(String result) {
        System.out.println(result);
    }
}
