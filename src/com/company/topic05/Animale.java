package com.company.topic05;

public abstract class Animale {

    protected double totalLitriDeLapte;
    protected double totalKgCarne;

    public abstract double returneazaLitri();
    public abstract double returneazakgCarne();

    public double getTotalLitriDeLapte() {
        return totalLitriDeLapte;
    }

    public double getTotalKgCarne() {
        return totalKgCarne;
    }
}
