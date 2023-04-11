package org.example;

public class User {
    String firstName;
    Region region;

    public User(String firstName, Region region) {
        this.firstName = firstName;
        this.region = region;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getRegion() {
        return region.getValue();
    }
}
