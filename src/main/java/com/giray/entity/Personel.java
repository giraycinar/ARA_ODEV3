package com.giray.entity;

import java.util.Random;

public class Personel {
    public Long id;
    public String ad;
    public String soyad;
    /**
     * M�d�r
     * M�hendis
     * Hizmetli
     */
    public Unvan unvan;
    /**
     * 0-->pasif
     * 1-->aktif
     * 2-->bloke
     */
    public State state;
    /**
     * Erkek
     * Kad�n
     * Belirtmek �stemiyor
     */
    public Cinsiyet cinsiyet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Unvan getUnvan() {
        return unvan;
    }

    public void setUnvan(Unvan unvan) {
        this.unvan = unvan;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public Personel() {
    }

    @Override
    public String toString() {
        return "Personel{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", unvan='" + unvan + '\'' +
                ", state=" + state +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }

    public Personel(String ad, String soyad, Unvan unvan, State state, Cinsiyet cinsiyet) {
        this.id = new Random().nextLong();
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
        this.state = state;
        this.cinsiyet = cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
