package com.company.topic1;

public class TestAngajat {

    public static void main(String[] args) {
        Angajat IonIonita;
        IonIonita = new Angajat("Ion", 30, "masculin", 3500);
        IonIonita.lucreazaSirguincios();

        Angajat MariaIonita;
        MariaIonita = new Angajat("Maria", 27, "feminin", 3500);
        MariaIonita.lucreazaSirguincios();
    }
}
