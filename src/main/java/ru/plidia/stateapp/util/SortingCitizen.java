package ru.plidia.stateapp.util;

import ru.plidia.stateapp.entity.State;

import java.util.Scanner;

public class SortingCitizen {

    public String averageCitizenAge(State state) {
        int allCitizen = 0;
        int size = state.getCitizen().size();
        for (int i = 0; i < size; i++) {
            allCitizen = allCitizen + state.getCitizen().get(i).getAge();
        }
        String result = "Всего жителей - " + size + " человек, средний возраст = " + allCitizen / size + "\n";
        return result;
    }

    public String sortNamesBeginningWithN(State state) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую букву имени для поиска жителей");
        char ch = sc.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
        }
        StringBuilder sb = new StringBuilder();
        int size = state.getCitizen().size();
        for (int iList = 0; iList < size; iList++) {
            String str = state.getCitizen().get(iList).getName();
            if (str.charAt(0) == ch) {
                sb.append(str).append("\n ");
            }

        }
        String result = "Список жителей, чьи имена начинаются на " + ch + ": " + sb + "\n";
        return result;
    }

    public String SortNumberOfLetterName(State state) {
        String result;
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 5 до 10");
        int num = sc.nextInt();
        if (num >= 5 && num <= 10) {
            int size = state.getCitizen().size();
            for (int i = 0; i < size; i++) {
                String str = state.getCitizen().get(i).getName();
                if (num == str.length()) {
                    sb.append(str).append("\n ");
                }
                sb.toString();
            }
            result = "Список жителей, чьи имена состоят из " + num + " букв:" + sb + "\n";
        } else {
            result = "Ввели не корректное значение, попробуйте сделать запрос ещё раз." + "\n";
        }
        return result;
    }
}