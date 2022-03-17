package com.company.topic1;

public class Angajat {
    public Angajat(String numeAtribuit, int virstaAtribuita, String genAtribuit, double salariuAtribuit) {
        nume = numeAtribuit;
        virsta = virstaAtribuita;
        gen = genAtribuit;
        salariu = salariuAtribuit;


    }

    String nume;
    int virsta;
    String gen;
    double salariu;
    boolean dornicDePromovare;

    public void lucreazaSirguincios() {
        System.out.println(nume + " " + gen + " " + salariu + " merita o promovare, si o marire de salariu");
        this.dornicDePromovare = true;

    }


}
