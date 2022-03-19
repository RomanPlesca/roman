package com.company.topic2;

import com.company.topic1.Angajat;

public class Main {
    public static void main(String[] args) {
        Persoana IonIonita;
        IonIonita = new Persoana("Ionita", "Ion", 30, "masculin", 81);
        IonIonita.afiseazaRezultatul(81);
        System.out.println(IonIonita.getGreutate());

    }
}
