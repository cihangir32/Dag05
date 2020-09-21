package com.example.cihangir.dag05;

public class Huis {
    private int aantalKamers;
    private Adres adres;


    public Huis(int aantalKamers, Adres adres) {
        this.aantalKamers = aantalKamers;
        this.adres = adres;
    }

    // Getters en Setters
    public int getAantalKamers() {
        return aantalKamers;
    }

    public void setAantalKamers(int aantalKamers) {
        this.aantalKamers = aantalKamers;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
