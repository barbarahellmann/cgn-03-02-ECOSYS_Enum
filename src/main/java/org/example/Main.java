package org.example;

public class Main {
    public static void main(String[] args) {
    Termin termin = new Termin();
    termin.setWeekDay(Weekday.TUESDAY);

        System.out.println(termin.getWeekDay());


        Termin termin2 = new Termin();
        termin2.setWeekDay(Weekday.MONDAY);

        System.out.println(termin2.getWeekDay());

        System.out.println(Weekday.WEDNESDAY.getAbbreviation());
    }
}