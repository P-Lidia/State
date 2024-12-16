package ru.plidia.stateapp.util;

import ru.plidia.stateapp.entity.State;

import java.util.Scanner;

public class OperationWithCitizenList {

    public String averageCitizenAge(State state) {
        int allCitizenAge = 0;
        int size = state.getCitizen().size();
        for (int i = 0; i < size; i++) {
            allCitizenAge = allCitizenAge + state.getCitizen().get(i).getAge();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Всего жителей - ").append(size)
                .append(" человек, средний возраст = ")
                .append(allCitizenAge / size).append("\n");
        return sb.toString();
    }

    public String sortNamesByFirstLetter(State state) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую букву имени для поиска жителей");
        char ch = sc.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
        }
        int size = state.getCitizen().size();
        StringBuilder sb = new StringBuilder();
        sb.append("Список жителей, чьи имена начинаются на ").append(ch).append(": \n");
        for (int i = 0; i < size; i++) {
            String str = state.getCitizen().get(i).getName();
            if (str.charAt(0) == ch) {
                sb.append(str).append("\n");
            }
        }
        return sb.toString();
    }

    public String sortNameOfLetterNumbers(State state) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 5 до 10");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (num >= 5 && num <= 10) {
            int size = state.getCitizen().size();
            sb.append("Список жителей, чьи имена состоят из ").append(num).append(" букв: \n");
            for (int i = 0; i < size; i++) {
                String str = state.getCitizen().get(i).getName();
                if (num == str.length()) {
                    sb.append(str).append("\n");
                }
            }
        } else {
            sb.append("Ввели не корректное значение, попробуйте сделать запрос ещё раз. \n");
        }
        return sb.toString();
    }
}