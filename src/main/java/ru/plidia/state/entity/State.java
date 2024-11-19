package ru.plidia.state.entity;

import java.util.List;

public class State {
    private static final State STATE = new State();
    private List<Region> region;
    private Capital capital;

    private State() {
    }

    public static State getInstance(List<Region> region, Capital capital) {
        return STATE;
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

