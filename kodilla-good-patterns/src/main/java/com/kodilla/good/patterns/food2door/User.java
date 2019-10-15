package com.kodilla.good.patterns.food2door;

public class User {
    private String name;
    private String surname;
    private String adress;
    private String email;

    public User(String name, String surname, String adress, String email) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }
}
