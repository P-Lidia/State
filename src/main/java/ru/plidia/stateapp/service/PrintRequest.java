package ru.plidia.stateapp.service;

import ru.plidia.stateapp.entity.State;

public class PrintRequest {
    public void printCapital(State state) {
        System.out.println(state.getCapital());
    }

    public void printRegionNumber(State state) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < state.getRegion().size(); i++) {
            sb.append(state.getRegion().get(i).getName()).append(", ");
        }
        System.out.println("В нашем государстве " + state.getRegion().size() + " области: " + sb + "\n");
    }

    public void printStateArea(State state) {
        System.out.println("Площадь государства составляет " + state.STATEAREA + "\n");
    }

    public void printSortResult(String result) {
        System.out.println(result);
    }

    public void printMessage() {
        System.out.println("Информация не найдена");
    }
}
