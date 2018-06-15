package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class AreaComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        long result = Math.round(o2.getArea()) - Math.round(o1.getArea());
        return (int) result;
    }
}
