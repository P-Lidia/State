package ru.plidia.state.util;

import ru.plidia.state.entity.Capital;
import ru.plidia.state.entity.Region;
import ru.plidia.state.entity.State;

import java.util.List;


public class PrintRequest {
    public void printCapital(Capital capital) {
        System.out.println("Столица государства: " + capital);
    }

    public void printRegionNumber(List<Region> regionList) {
        System.out.println("Количество областей :" + regionList.size());
    }

    public void printStateArea(State state) {
        System.out.println("Площадь государства составляет" + state.STATEAREA);
    }

}
