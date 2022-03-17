package com.company.topic2;

import com.company.topic1.Angajat;

public class Main {
    public static void main(String[] args) {
        Persoana IonIonita;
        IonIonita = new Persoana("Ionita", "Ion", 30, "masculin", 80);
        IonIonita.afiseazaRezultatul(80);
        System.out.println(IonIonita.getGreutate());

    }
}
