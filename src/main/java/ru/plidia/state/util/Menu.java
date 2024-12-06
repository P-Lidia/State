package ru.plidia.state.util;

import ru.plidia.state.entity.Citizen;
import ru.plidia.state.entity.State;
import ru.plidia.state.service.PrintRequest;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menuChoice(SortingCitizen sorting, PrintRequest request, State state) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Нажмите 1, чтобы узнать информацию про столицу нашего государства");
            System.out.println("Нажмите 2, чтобы количество областей в нашем государстве");
            System.out.println("Нажмите 3, если хотите узнать площадь нашего государства");
            System.out.println("Нажмите 4, если хотите узнать средник возраст наших граждан");
            System.out.println("Нажмите 5, для поиска наших граждан по первой букве в имени");
            System.out.println("Нажмите 6, для поиска граждан по количеству букв в имени");
            System.out.println("Выберите интересующий Вас вариант");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    request.printCapital(state);
                    break;
                case 2:
                    request.printRegionNumber(state);
                    break;
                case 3:
                    request.printStateArea(state);
                    break;
                case 4:
                    sorting.averageCitizenAge(state);
                    break;
                case 5:
                    sorting.sortNamesBeginningWithN(state);
                    break;
                case 6:
                    sorting.SortNumberOfLetterName(state);
                    break;
            }
        }
    }
}
