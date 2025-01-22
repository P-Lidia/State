package ru.plidia.stateapp.util;

import ru.plidia.stateapp.entity.Citizen;
import ru.plidia.stateapp.entity.State;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OperationWithCitizenList {

    public List<Citizen> creatAllCitizenList(State state) {
        List<Citizen> allCitizenList = state.getRegion().stream()
                .flatMap(districts -> districts.getDistrict().stream())
                .collect(Collectors.toList())
                .stream().flatMap(city -> city.getCity().stream())
                .collect(Collectors.toList())
                .stream().flatMap(citizen -> citizen.getCitizenList().stream())
                .collect(Collectors.toList());
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
        return sb.append("Всего жителей - ")
                .append(size)
                .append(" человек, средний возраст = ")
                .append(allCitizenAge / size)
                .append("\n")
                .toString();
    }

    public String sortNamesByFirstLetter(State state) {
        List<Citizen> citizenList = creatAllCitizenList(state);
        StringBuilder sb = new StringBuilder();
        System.out.println("Введите первую букву имени для поиска жителей");
        char ch = new Scanner(System.in).next().charAt(0);
        if (Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
        }
        if (ch > 'A' && ch < 'Z') {
            int size = citizenList.size();
            sb
                    .append("Список жителей, чьи имена начинаются на ")
                    .append(ch)
                    .append(": \n");
            for (int i = 0; i < size; i++) {
                String str = citizenList.get(i).getName();
                if (str.charAt(0) == ch) {
                    sb.append(citizenList.get(i));
                }
            }
        } else {
            sb
                    .append("Ввели некорректное значение, попробуйте сделать запрос ещё раз.")
                    .append("\n");
        }
        return sb.toString();
    }

    public String sortNameOfLetterNumbers(State state) {
        List<Citizen> citizenList = creatAllCitizenList(state);
        System.out.println("Введите число от 5 до 10");
        int num = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        if (num >= 5 && num <= 10) {
            int size = citizenList.size();
            sb
                    .append("Список жителей, чьи имена состоят из ")
                    .append(num)
                    .append(" букв: \n");
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