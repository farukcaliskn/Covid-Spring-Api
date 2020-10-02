package com.covid.spring.models;

 public class Cases {

    private final String cases;
    private final String death;
    private final String recovered;

    public Cases(String cases, String death, String recovered) {
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

}
