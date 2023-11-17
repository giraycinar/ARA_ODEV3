package com.giray.entity;

public class AracTurleri {
    /**
     * siyah
     * beyaz
     * mavi
     */
    public Renk renk;
    /**
     * binek
     * suv
     */
    public Cesit cesit;
    /**
     * benzin
     * dizel
     */
    public Yakit yakitTuru;

    public AracTurleri(String siyah, String suv, String dizel) {
    }

    public AracTurleri(Renk renk, Cesit cesit, Yakit yakitTuru) {
        this.renk = renk;
        this.cesit = cesit;
        this.yakitTuru = yakitTuru;
    }

    public Renk getRenk() {
        return renk;
    }

    public void setRenk(Renk renk) {
        this.renk = renk;
    }

    public Cesit getCesit() {
        return cesit;
    }

    public void setCesit(Cesit cesit) {
        this.cesit = cesit;
    }

    public Yakit getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(Yakit yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    @Override
    public String toString() {
        return "AracTurleri{" +
                "renk='" + renk + '\'' +
                ", cesit='" + cesit + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                '}';
    }
}
