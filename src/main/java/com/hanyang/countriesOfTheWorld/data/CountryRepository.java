package com.hanyang.countriesOfTheWorld.data;

import com.hanyang.countriesOfTheWorld.model.Country;
import com.hanyang.countriesOfTheWorld.model.NotFoundException;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("India", "1,324,171,354", "New Dehli", new String[]{"Hindi", "English"}),
            new Country("Kenya", "48,655,760", "Nairobi", new String[]{"English","Kiswahili"}),
            new Country("Ecuador","16,385,068", "Quito", new String[]{"Spanish"}),
            new Country("France", "66,991,000", "Paris", new String[]{"French"}),
            new Country("Italy", "60,589,445", "Rome", new String[]{"Italian"})
    );

    public List<Country> getAllCountries() {
        return ALL_COUNTRIES;
    }

    public Country findByCountryName(String countryName) {
        return ALL_COUNTRIES.stream().
                filter(country -> country.getName().equals(countryName)).
                findFirst().
                orElseThrow(() -> new NotFoundException());
    }

    public List<Country> sortByName() {
        Collections.sort(ALL_COUNTRIES, new Comparator<Country>(){
            @Override
            public int compare(Country c1, Country c2) {
                int res = c1.getName().toUpperCase().compareTo(c2.getName().toUpperCase());
                if (res == 0) {
                    String population1 = c1.getPopulation().replaceAll(",", "");
                    String population2 = c2.getPopulation().replaceAll(",", "");
                    return Integer.valueOf(population2) - Integer.valueOf(population1);
                }
                return res;
            }
        });
        return new ArrayList<>(ALL_COUNTRIES);
    }

    public List<Country> sortByPopulation() {
        Collections.sort(ALL_COUNTRIES, new Comparator<Country>() {
            @Override
            public int compare(Country c1, Country c2) {
                String population1 = c1.getPopulation().replaceAll(",", "");
                String population2 = c2.getPopulation().replaceAll(",", "");
                return Integer.valueOf(population2) - Integer.valueOf(population1);
            }
        });
        return new ArrayList<>(ALL_COUNTRIES);
    }
}
