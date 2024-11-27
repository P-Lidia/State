package ru.plidia.state.service;

import java.util.Random;

public class RandomGeneration {

    public static String generateName(String name) {
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

    public static int generateAge(int age) {
        return (int) (Math.random() * 100);
    }
}
