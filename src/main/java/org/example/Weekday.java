package org.example;

public enum Weekday {

    MONDAY("mo"),
    TUESDAY("tu"),
    WEDNESDAY("we"),
    THURSDAY("th"),
    FRIDAY("fr"),
    SATURDAY("sa"),
    SUNDAY("so");

    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }

    Weekday(String abbreviation) {
        this.abbreviation =  abbreviation;
    }

}
