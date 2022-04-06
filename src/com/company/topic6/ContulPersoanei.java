package com.company.topic6;

public class ContulPersoanei {

    private String numePersoana;
    private int id;
    private double sumaCurenta;

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSumaCurenta(double sumaCurenta) {
        if (sumaCurenta > 0) {
            this.sumaCurenta = sumaCurenta;
        } else System.out.println("Soldul nu poate fi negativ");
    }

    public String getNumePersoana() {
        return this.numePersoana;

            }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public int getId() {
        return id;
    }

    public double sustragereDeBani(double sumaExtrasa) {
        if (sumaExtrasa > sumaCurenta) {
            System.out.println("Nu aveti destule resurse:P");
        }
        return (sumaCurenta - sumaExtrasa);

    }
}
