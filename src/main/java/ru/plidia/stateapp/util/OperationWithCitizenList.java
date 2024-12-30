package ru.plidia.stateapp.util;

import ru.plidia.stateapp.entity.Citizen;
import ru.plidia.stateapp.entity.State;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperationWithCitizenList {

    public List<Citizen> creatAllCitizenList(State state) {
        List<Citizen> allCitizenList = new ArrayList<>();
        int sizeRegion = state.getRegion().size();
        for (int i = 0; i < sizeRegion; i++) {
            int sizeDistrict = state.getRegion().get(i).getDistrict().size();
            for (int j = 0; j < sizeDistrict; j++) {
                int sizeCity = state.getRegion().get(i).getDistrict().get(j).getCity().size();
                for (int k = 0; k < sizeCity; k++) {
                    int sizeCitizen = state.getRegion().get(i).getDistrict().get(j).getCity().get(k).getCitizenList().size();
                    for (int l = 0; l < sizeCitizen; l++) {
                        allCitizenList.add(state.getRegion().get(i).getDistrict().get(j).getCity().get(k).getCitizenList().get(l));
                    }
                }
            }
        }
        return allCitizenList;
    }

    public String averageCitizenAge(State state) {
        List<Citizen> citizenList = creatAllCitizenList(state);
        int allCitizenAge = 0;
        int size = citizenList.size();
        for (int i = 0; i < size; i++) {
            allCitizenAge = allCitizenAge + citizenList.get(i).getAge();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Всего жителей - ").append(size)
                .append(" человек, средний возраст = ")
                .append(allCitizenAge / size).append("\n");
        return sb.toString();
    }

    public String sortNamesByFirstLetter(State state) {
        List<Citizen> citizenList = creatAllCitizenList(state);
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую букву имени для поиска жителей");
        char ch = sc.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
        }
        if (ch > 'A' && ch < 'Z') {
            int size = citizenList.size();
            sb.append("Список жителей, чьи имена начинаются на ").append(ch).append(": \n");
            for (int i = 0; i < size; i++) {
                String str = citizenList.get(i).getName();
                if (str.charAt(0) == ch) {
                    sb.append(citizenList.get(i));
                }
            }
        } else {
            sb.append("Ввели некорректное значение, попробуйте сделать запрос ещё раз.").append("\n");
        }
        return sb.toString();
    }

    public String sortNameOfLetterNumbers(State state) {
        List<Citizen> citizenList = creatAllCitizenList(state);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 5 до 10");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (num >= 5 && num <= 10) {
            int size = citizenList.size();
            sb.append("Список жителей, чьи имена состоят из ").append(num).append(" букв: \n");
            for (int i = 0; i < size; i++) {
                String str = citizenList.get(i).getName();
                if (num == str.length()) {
                    sb.append(citizenList.get(i));
                }
            }
        } else {
            sb.append("Ввели некорректное значение, попробуйте сделать запрос ещё раз. \n");
        }
        return sb.toString();
    }
}