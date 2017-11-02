package com.hanyang.countriesOfTheWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountriesController {
    @RequestMapping("/")
    public String listCountries() {
        return "index";
    }
}
