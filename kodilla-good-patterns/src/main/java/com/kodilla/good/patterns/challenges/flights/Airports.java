package com.kodilla.good.patterns.challenges.flights;

public class Airports {
    private String city;
    private String shortcut;

    public Airports(String city, String shortcut) {
        if (city == null || city.isEmpty() || shortcut == null || shortcut.isEmpty()) {
            throw new IllegalArgumentException("City and shortcut cannot be null or empty");
        }
        this.city = city;
        this.shortcut = shortcut;
    }

    public String getCity() {
        return city;
    }

    public String getShortcut() {
        return shortcut;
    }
}
