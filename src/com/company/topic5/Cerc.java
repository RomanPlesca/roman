package com.company.topic5;

public class Cerc extends FiguraGeometrica {

    private double razaCercului;

    public void setRazaCercului(double razaCercului) {
        if (razaCercului < 0) {
            System.out.println("Raza este nonvalida");
        } else {
            this.razaCercului = razaCercului;
        }

    }

    public double getRazaCercului() {
        return razaCercului;
    }

    @Override
    public double returneazaAria() {
        this.ariaFigurii = 3.14 * razaCercului * razaCercului;
        return this.ariaFigurii;
    }

    @Override
    public double returneazaPerimetru() {
        this.perimetruFigurii = 2 * 3.14 * razaCercului;
        return this.perimetruFigurii;
    }
}
