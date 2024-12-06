package ru.plidia.state.util;

import ru.plidia.state.entity.State;
import ru.plidia.state.service.PrintRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingCitizen {

    public void averageCitizenAge(State state) {
        int allCitizen = 0;
        int size = state.getCitizen().size();
        for (int i = 0; i < size; i++) {
            allCitizen = allCitizen + state.getCitizen().get(i).getAge();
        }
        String result = "Всего жителей - " + allCitizen + " человек, средний возраст = " + allCitizen / size;
        PrintRequest.printSortResult(result);

    }

    public void sortNamesBeginningWithN(State state) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву, по которой будем искать имена жителей");
        char ch = sc.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
        }
        List<String> citizenNames = new ArrayList<>();
        int size = state.getCitizen().size();
        for (int iList = 0; iList < size; iList++) {
            String str = state.getCitizen().get(iList).getName();
            if (str.charAt(0) == ch) {
                citizenNames.add(str);
            }
        }
        String result = "Список жителей, чьи имена начинаются на " + ch + ": " + citizenNames;
        PrintRequest.printSortResult(result);
    }

    public void SortNumberOfLetterName(State state) {
        List<String> citizenNames = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 5 до 10");
        int num = sc.nextInt();
        int size = state.getCitizen().size();
        for (int i = 0; i < size; i++) {
            String str = state.getCitizen().get(i).getName();
            if (num == str.length()) {
                citizenNames.add(str);
            }
        }
        String result = "Список жителей, чьи имена состоят из " + num + " букв:" + citizenNames;
        PrintRequest.printSortResult(result);
    }
}
