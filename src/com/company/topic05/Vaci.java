package com.company.topic05;

public class Vaci extends Animale {

    private int capete;
    private double litriDeLapte;
    private double kgCarne;

    public void setCantitate(int capete, double litriDeLapte, double kgCarne) {
        if ((capete > 0) || (litriDeLapte > 0) || (kgCarne > 0)) {
            this.capete = capete;
            this.litriDeLapte = litriDeLapte;
            this.kgCarne = kgCarne;
        } else {
            System.out.println("Cantitatea de capete a fost introdusa gresit");
        }

    }

    @Override
    public double returneazaLitri() {
        this.totalLitriDeLapte = capete * litriDeLapte;
        return this.totalLitriDeLapte;
    }

    @Override
    public double returneazakgCarne() {
        this.totalKgCarne = capete * kgCarne;
        return this.totalKgCarne;
    }
}
