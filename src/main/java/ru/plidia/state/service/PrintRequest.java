package ru.plidia.state.service;

import ru.plidia.state.entity.Capital;
import ru.plidia.state.entity.Citizen;
import ru.plidia.state.entity.Region;
import ru.plidia.state.entity.State;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrintRequest {
    public void printCapital(State state) {
        System.out.println("Столица государства: " + state.getCapital());
    }

    public void printRegionNumber(State state) {

        System.out.println("Количество областей :" + state.getRegion().size());
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

    public void printNamesBeginningWithN(List<Citizen> citizenList) {
        List<String> citizenNames = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву, по которой будем искать имена жителей");
        char ch = sc.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
        }
        int size = citizenList.size();
        for (int iList = 0; iList < size; iList++) {
            String str = citizenList.get(iList).getName();
            if (str.charAt(0) == ch) {
                citizenNames.add(str);
            }
        }
        System.out.println("Список жителей, чьи имена начинаются на " + ch + ": " + citizenNames);
    }

    public void printNumberOfLetterName(List<Citizen> citizenList) {
        List<String> citizenNames = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 5 до 10");
        int num = sc.nextInt();
        int size = citizenList.size();
        for (int i = 0; i < size; i++) {
            String str = citizenList.get(i).getName();
            if (num == str.length()) {
                citizenNames.add(str);
            }
        }
        System.out.println("Список жителей, чьи имена состоят из " + num + " букв:" + citizenNames);
    }


}
