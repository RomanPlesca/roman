package com.company.topic5;

public class Main {
    public static void main(String[] args) {
        Cerc cerc1 = new Cerc();
        Patrat patrat2 = new Patrat();
        Romb romb3 = new Romb();

        cerc1.setRazaCercului(3);
        System.out.println("Aria cercului este: " + cerc1.returneazaAria());
        System.out.println("Perimetrul cercului este: " + cerc1.returneazaPerimetru());


        patrat2.setLatura(3);
        patrat2.returneazaAria();
        patrat2.returneazaPerimetru();
        System.out.println("Perimetrul patratului este: " + patrat2.getPerimetruFigurii());
        System.out.println("Aria patratului este: " + patrat2.getAriaFigurii());

        romb3.setDiagonale(32,31);
        romb3.setLaturile(20,19);
        romb3.returneazaAria();
        romb3.returneazaPerimetru();
        System.out.println("Perimetrul rombului este: " + romb3.getPerimetruFigurii());
        System.out.println("Aria rombului este: " + romb3.getAriaFigurii());
    }
}
