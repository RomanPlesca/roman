package com.company.topic5;

public class Patrat extends FiguraGeometrica {

    private double latura;

    public void setLatura(double latura) {
        if (latura < 0) {
            System.out.println("Dimensiunea laturii este incorecta");
        } else {
            this.latura = latura;
        }

    }

    @Override
    public double returneazaAria() {
        this.ariaFigurii = latura * latura;
        return this.ariaFigurii;
    }

    @Override
    public double returneazaPerimetru() {
        this.perimetruFigurii = 4 * latura;
        return this.perimetruFigurii;
    }
}
