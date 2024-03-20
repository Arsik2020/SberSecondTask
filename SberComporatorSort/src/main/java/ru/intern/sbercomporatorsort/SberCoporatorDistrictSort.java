package ru.intern.sbercomporatorsort;

import java.util.Comparator;
import java.util.List;
import ru.intern.sberutils.ProcessCity;
import ru.intern.sberutils.bean.City;

public class SberCoporatorDistrictSort extends ProcessCity {

    @Override
    public void doAction(String path) {
        List<City> allCities = super.doProcess(path);
        allCities.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));

        for (City city : allCities) {
            System.out.println(city.toString());
        }
    }

}
