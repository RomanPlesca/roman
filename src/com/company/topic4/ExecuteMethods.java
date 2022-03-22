package com.company.topic4;

public class ExecuteMethods {
    public static void main(String[] args) {
        int rezultat = Methods.sum(21, 33);
        System.out.println(rezultat);

        int rezultat2 = Methods.sum(21, 21);
        System.out.println(rezultat2);

        int rezultat3 = Methods.sum(35, 33);
        System.out.println(rezultat3);

        Methods.sum(21);
        Methods.sum(3.14);
        Methods.sum(-2);

    }
}
