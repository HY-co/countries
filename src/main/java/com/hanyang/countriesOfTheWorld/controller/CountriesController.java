package com.hanyang.countriesOfTheWorld.controller;

import com.hanyang.countriesOfTheWorld.data.CountryRepository;
import com.hanyang.countriesOfTheWorld.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CountriesController {
    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String listCountries(ModelMap modelMap) {
        List<Country> countries = countryRepository.getAllCountries();
        modelMap.put("countries", countries);
        return "index";
    }
}
