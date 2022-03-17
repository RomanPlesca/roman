package com.company.topic2;

public class Persoana {
    public Persoana(String numeAtribuit, String prenumeAtribuit, int virstaAtribuita, String genAtribuit, double greutateAtribuita) {
        nume = numeAtribuit;
        prenume = prenumeAtribuit;
        virsta = virstaAtribuita;
        gen = genAtribuit;
        greutate = greutateAtribuita;

    }

    String nume;
    String prenume;
    private int virsta;
    String gen;
    private double greutate;


    public void afiseazaRezultatul(double greutateAtribuita) {
        if (greutateAtribuita > 80) {
            System.out.println("Persoana data are nevoie de antrenamente");
        } else {
            this.greutate = greutateAtribuita;
            System.out.println("Persoana are o greutate corespunzatoare");
        }

    }

    public double getGreutate() {
        return greutate;
    }
}

