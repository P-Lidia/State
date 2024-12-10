package ru.plidia.stateapp.service;

import ru.plidia.stateapp.entity.State;

public class PrintRequest {
    public void printCapital(State state) {
        System.out.println(state.getCapital());
    }

    public void printRegionNumber(State state) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < state.getRegion().size() - 1; i++) {
            sb.append(state.getRegion().get(i).getName()).append(", ");
        }
        sb.append(state.getRegion().get(state.getRegion().size() - 1).getName()).append(".");
        System.out.println("В нашем государстве " + state.getRegion().size() + " области: " + sb + "\n");
    }

    public void printStateArea(State state) {
        System.out.println("Площадь государства составляет " + state.STATEAREA  + "\n");
    }

    public static void printSortResult(String result) {
        System.out.println(result);
    }
}
