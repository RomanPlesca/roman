package com.company.topic05;

public class Main {
    public static void main(String[] args) {
        Capre capreM = new Capre();
        Oi oiM = new Oi();
        Vaci vaciM = new Vaci();

        capreM.setCantitate(5, 2, 15);
        System.out.println("Total litri de lapte de la capre: " + capreM.returneazaLitri());
        System.out.println("Total KG de carne de capre: " + capreM.returneazakgCarne());
        System.out.println();

        oiM.setCantitate(10, 1.5, 40);
        System.out.println("Total litri de lapte de la oi: " + oiM.returneazaLitri());
        System.out.println("Total KG de carne de ovina: " + oiM.returneazakgCarne());
        System.out.println();

        vaciM.setCantitate(20, 7, 150);
        System.out.println("Total litri de lapte de la vaci: " + vaciM.returneazaLitri());
        System.out.println("Total KG de carne de bovina: " + vaciM.returneazakgCarne());
    }
}
