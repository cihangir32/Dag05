package com.example.cihangir.dag05;

public class Adres {
    private String woonplaats;
    private String straat;
    private int nummer;
    private String land;

    public Adres(String woonplaats, String straat, int nummer, String land) {
        this.woonplaats = woonplaats;
        this.straat = straat;
        this.nummer = nummer;
        this.land = land;
    }



    // Getters en Setters
    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String toStringAdres() {
        return "Adres{" +
                "woonplaats='" + woonplaats + '\'' +
                ", straat='" + straat + '\'' +
                ", nummer=" + nummer +
                ", land='" + land + '\'' +
                '}';
    }
}
