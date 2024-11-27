package ru.plidia.state.entity;

import java.util.List;

public class State {
    private static State instance;
    private List<Region> region;
    private Capital capital;
    public final String STATEAREA = "200 000 км²";

    private State() {
    }

    public static State getInstance() {
        if (instance == null) {
            instance = new State();
        }
        return instance;
    }

    public void setRegion(List<Region> region) {
        this.region = region;
    }

    public List<Region> getRegion() {
        return region;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    public Capital getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(capital).append(region);
        return sb.toString();
    }
}


