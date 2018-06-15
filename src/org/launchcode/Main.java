package org.launchcode;

import org.launchcode.comparators.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator comparator = new NameComparator();
        cities.sort(comparator);

        printCities(cities);

        StateComparator statie = new StateComparator();
        cities.sort(statie);
        printCities(cities);

        PopulationComparator poppie = new PopulationComparator();
        cities.sort(poppie);
        printCities(cities);

        AreaComparator arrie = new AreaComparator();
        cities.sort(arrie);
        printCities(cities);

        CompoundComparator compComparator = new CompoundComparator();
        compComparator.add(new StateComparator());
        compComparator.add(new PopulationComparator());
        cities.sort(compComparator);
        cities.sort(compComparator);
        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
