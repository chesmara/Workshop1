package com.example.chesmara.workshop1.model;

/**
 * Created by Alen on 29-Apr-17.
 */

public class User {

    private String firstName;
    private String lastName;
    private String iconUrl;

    public User(String firstName, String lastName, String iconUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iconUrl = iconUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", iconUrl='").append(iconUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
