package ru.plidia.stateapp.util;

import ru.plidia.stateapp.entity.State;
import ru.plidia.stateapp.service.PrintRequest;

import java.util.Scanner;

public class Menu {
    private final OperationWithCitizenList sorting = new OperationWithCitizenList();
    private final PrintRequest print = new PrintRequest();

    public void menuChoice(State state) {
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
                    print.printCapital(state);
                    break;
                case 2:
                    print.printRegionNumber(state);
                    break;
                case 3:
                    print.printStateArea(state);
                    break;
                case 4:
                    print.printSortResult(sorting.averageCitizenAge(state));
                    break;
                case 5:
                    print.printSortResult(sorting.sortNamesByFirstLetter(state));
                    break;
                case 6:
                    print.printSortResult(sorting.sortNameOfLetterNumbers(state));
                    break;
                default:
                    print.printMessage();
            }
        }
    }
}
