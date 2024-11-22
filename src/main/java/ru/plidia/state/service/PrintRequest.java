package ru.plidia.state.service;

import ru.plidia.state.entity.Capital;
import ru.plidia.state.entity.Citizen;
import ru.plidia.state.entity.Region;
import ru.plidia.state.entity.State;

import java.util.List;
import java.util.Scanner;


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

    public void averageCitizenAge(List<Citizen> citizenList) {
        int allCitizen = 0;
        int size = citizenList.size();
        for (int i = 0; i < size; i++) {
            allCitizen = allCitizen + citizenList.get(i).getAge();
        }
        System.out.println("Всего жителей - " + allCitizen + " человек, средний возраст = "
                + (allCitizen / size));
    }




}
