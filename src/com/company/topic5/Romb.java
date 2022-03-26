package com.company.topic5;

public class Romb extends FiguraGeometrica {

    private double laturaMare;
    private double laturaMica;
    private double diagonalaMare;
    private double diagonalaMica;

    public void setDiagonale(double diagonalaMare, double diagonalaMica) {
        if ((diagonalaMare > diagonalaMica) && (diagonalaMare > 0) && (diagonalaMica > 0)) {
            this.diagonalaMare = diagonalaMare;
            this.diagonalaMica = diagonalaMica;
        } else {
            System.out.println("Diagonalele setate nu sunt valide!");
        }

    }

    public void setLaturile(double laturaMare, double laturaMica) {
        if ((laturaMare > laturaMica) && (laturaMare > 0) && (laturaMica > 0)) {
            this.laturaMare = laturaMare;
            this.laturaMica = laturaMica;
        } else {
            System.out.println("Laturile au fost setate gresit!");
        }

    }

    @Override
    public double returneazaAria() {
        this.ariaFigurii = diagonalaMare * diagonalaMica / 2;
        return this.ariaFigurii;
    }

    @Override
    public double returneazaPerimetru() {
        this.perimetruFigurii = 2 * laturaMare + 2 * laturaMica;
        return this.perimetruFigurii;
    }
}
