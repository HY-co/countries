package com.hanyang.countriesOfTheWorld.model;

public class Country {
    private String name;
    private String population;
    private String capital;
    private String[] officialLanguages ;

    public Country(String name, String population, String capital, String[] officialLanguages) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.officialLanguages = officialLanguages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String[] getOfficialLanguages() {
        return officialLanguages;
    }

    public void setOfficialLanguages(String[] officialLanguages) {
        this.officialLanguages = officialLanguages;
    }
}
