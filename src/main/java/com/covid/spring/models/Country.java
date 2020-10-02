package com.covid.spring.models;

public class Country {

    private final String country;
    private final String cases;
    private final String death;
    private final String recovered;

    public Country(String country, String cases, String death, String recovered) {
        this.country = country;
        this.cases = cases;
        this.death = death;
        this.recovered = recovered;
    }

    public String getCases() {
        return cases;
    }

    public String getDeath() {
        return death;
    }

    public String getRecovered() {
        return recovered;
    }

    public String getCountry() {
        return country;
    }
}
