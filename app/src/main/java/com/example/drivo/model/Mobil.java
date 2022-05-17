package com.example.drivo.model;

public class Mobil {

    private String namaMobil;
    private String ratingMobil;
    private String hargaSewa;
    private int gambarMobil;

    public Mobil(String namaMobil, String ratingMobil, String hargaSewa, int gambarMobil) {
        this.namaMobil = namaMobil;
        this.ratingMobil = ratingMobil;
        this.hargaSewa = hargaSewa;
        this.gambarMobil = gambarMobil;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public String getRatingMobil() {
        return ratingMobil;
    }

    public void setRatingMobil(String ratingMobil) {
        this.ratingMobil = ratingMobil;
    }

    public String getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(String hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public int getGambarMobil() {
        return gambarMobil;
    }

    public void setGambarMobil(int gambarMobil) {
        this.gambarMobil = gambarMobil;
    }

}
