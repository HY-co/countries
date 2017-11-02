package com.hanyang.countriesOfTheWorld.data;

import com.hanyang.countriesOfTheWorld.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("india", 1324171354, "New Dehli", new String[]{"Hindi", "English"}),
            new Country("Kenya", 48655760, "Nairobi", new String[]{"English","Kiswahili"}),
            new Country("ecuador",16385068, "Quito", new String[]{"Spanish"}),
            new Country("France", 66991000, "Paris", new String[]{"French"}),
            new Country("Italy", 60589445, "Rome", new String[]{"Italian"})
    );

    public List<Country> getAllCountries() {
        return ALL_COUNTRIES;
    }
}
