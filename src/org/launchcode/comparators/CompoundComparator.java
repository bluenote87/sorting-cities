package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompoundComparator implements Comparator<City> {

    List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> aCity) {
        comparators.add(aCity);
    }

    @Override
    public int compare(City o1, City o2) {

            Comparator<City> aCompare = comparators.get(0);
            if (aCompare.compare(o1, o2) == 0) {
                Comparator<City> newCompare = comparators.get(1);
                return newCompare.compare(o1, o2);
            } else {
                return aCompare.compare(o1, o2);
            }
    }
}
