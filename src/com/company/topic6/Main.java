package com.company.topic6;

public class Main {
    public static void main(String[] args) {

        ContulPersoanei contul01 = new ContulPersoanei();
        contul01.setId(23456);
        contul01.setNumePersoana("Ion Ionut");
        contul01.setSumaCurenta(1256.20);
        double soldRamasDupaExtragere = contul01.sustragereDeBani(1523);
        System.out.println("Soldul curent este: " + soldRamasDupaExtragere);
    }


}
