package ru.plidia.state.service;


public class RandomGeneration {

    public int generateCitizenNumbers() {
        return (int) (Math.random() * 100);
    }

    public int generateCityNumbers() {
        return (int) (Math.random() * 10);
    }

    public int generateDistrictNumbers() {
        return (int) (Math.random() * 4);
    }

    public int generateRegionNumbers() {
        return (int) (Math.random() * 2);
    }

}

