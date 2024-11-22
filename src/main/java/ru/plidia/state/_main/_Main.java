package ru.plidia.state._main;


import ru.plidia.state.entity.*;
import ru.plidia.state.service.PrintRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Main {
    public static void main(String[] args) {

        List<Citizen> citizens = Stream.generate(Citizen::new)
                .limit(1000).collect(Collectors.toList());


        City city = new City("Asdsds", citizens.size(), citizens);
        List<City> cities = new ArrayList<>();
        int counter = (int) (Math.random() * 10);
        for (int i = 0; i <= counter; i++) {
            cities.add(city);
        }
        //       System.out.println(cities);

        District district = new District("Sfdfdf", cities.size(), cities);
        List<District> districts = new ArrayList<>();
        int count = (int) (Math.random() * 4);
        for (int i = 0; i <= count; i++) {
            districts.add(district);
        }
        Region region = new Region("Ysdfc", districts.size(), districts);
        List<Region> regions = new ArrayList<>();
        count = (int) (Math.random() * 2);
        for (int i = 0; i <= count; i++) {
            regions.add(region);
        }
        Capital capital = new Capital("Capital", citizens.size(), citizens);
        State state = State.getInstance();
        PrintRequest request = new PrintRequest();


    }
}
