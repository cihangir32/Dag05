package com.example.cihangir.dag05;

public class Persoon {
    private int id;
    private String naam;
    private int leeftijd;

    public Persoon(int id, String naam, int leeftijd) {
        this.id = id;
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
}


