package com.company.topic3;

public class Operations {
    static void printAritmeticOperations(double p, double r) {

        System.out.println("Adunarea: " + (p + r));
        System.out.println("Scaderea: " + (p - r));
        System.out.println("Inmultirea: " + (p * r));
        System.out.println("Impartirea: " + (p / r));
        System.out.println("Restul impartirii: " + (p % r));
        System.out.println("Pre-increment: " + (++r));
        System.out.println("Post-increment: " + (r++));
        System.out.println("Pre-decriment: " + (--p));
        System.out.println(("Post-decriment: " + (p--)));

    }


    static void printLogicOperations(boolean p, boolean r) {
        System.out.println("p && r = " + (p && r));
        System.out.println("p || r = " + (p || r));
        System.out.println("!(p && r) = " + !(p && r));

    }

    ;

    static void printRelationarOperations(int p, int r) {
        System.out.println("Egalitate: " + (p == r));
        System.out.println("Inegalitate: " + (p != r));
        System.out.println("Este mai mare: " + (p > r));
        System.out.println("Este mai mic: " + (p < r));
        System.out.println("Este mai mare sau egal: " + (p >= r));
        System.out.println("Este mai mic sau egal: " + (p <= r));


    }

    ;

    static void useForAndWhile(int limita) {
        int index = 21;
        while (index < limita) {
            System.out.print(index + " ");
            index++;
        }
        System.out.println("Valoarea finala a executiei while este: " + index);

        for (int p = 21; p <= limita; p++) {
            System.out.print(p+ " ");
        }
        System.out.println("Ciclul FOR a fost finisat");

    }


}
