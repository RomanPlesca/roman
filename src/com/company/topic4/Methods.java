package com.company.topic4;

public class Methods {
    static int sum(int p, int r) {
        int suma = 0;
        if (p > r) {
            System.out.println("Calculul este imposibil");
            return suma;
        } else if (p == r) {
            System.out.println("Valorile sunt identice");
            return p;
        } else {
            for (int n = p; n <= r; n++) {
                suma = suma + n;
            }
            System.out.println("Ciclul FOR s-a finisat");
        }
        return suma;
    }

    static void sum(double p) {
        double suma = 0;
        if (p > 0) {
            while (p > 0) {
                suma += p;
                p--;
            }
            System.out.println("Executia WHILE s-a finisat");
            System.out.println(suma);
        } else if (p == 0) {
            System.out.println("Rezultatul este 0");
        } else {
            System.out.println("p este mai mic ca zero, deci operatia este imposibila");
        }
    }
}
