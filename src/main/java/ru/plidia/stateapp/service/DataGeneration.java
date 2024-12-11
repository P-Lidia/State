package ru.plidia.stateapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGeneration {

    public static String generateRandomName(String name) {
        Random random = new Random();
        int capacity = 5 + (int) (Math.random() * 5);
        StringBuilder sb = new StringBuilder(capacity);
        for (int i = 0; i < 1; i++) {
            sb.append((char) ('A' + random.nextInt(25)));
        }
        for (int i = 1; i < sb.capacity(); i++) {
            sb.append((char) ('a' + random.nextInt(25)));
        }
        return sb.toString();
    }

    public static int generateRandomAge(int age) {
        return (int) (Math.random() * 100);
    }


    public <T> List<T> generateList(List<T> list, int firstNum, int endNum) {
        List<T> objectList = new ArrayList<>();
        for (int j = firstNum; j < endNum; j++) {
            objectList.add(list.get(j));
        }
        return objectList;
    }
}
