package com.hanyang.countriesOfTheWorld.model;

public class Country {
    private String name;
    private int population;
    private String capital;
    private String[] officialLanguages ;

    public Country(String name, int population, String capital, String[] officialLanguages) {
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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
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
