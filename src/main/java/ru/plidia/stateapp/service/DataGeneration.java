package ru.plidia.stateapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGeneration {
    public static String generateRandomName(String name) {
        Random random = new Random();
        int capacity = 5 + (int) (Math.random() * 6);
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

    public <T> List<T> generateList(List<T> list, int num, int j) {
        List<T> objectList = new ArrayList<>();
        for (int i = j; i < num; i++) {
            objectList.add(list.get(i));
        }
        return objectList;
    }
}
