package it.epicode.week1.day3;

public class Esercizio1 {
    public static void main(String[] args) {
        stampaRettangolo(new Rettangolo(2, 5));
        stampaDueRettangoli(new Rettangolo(1, 1), new Rettangolo(1, 1));
    }

    public static void stampaRettangolo(Rettangolo rettangolo){
        System.out.println("Il perimetro del rettangolo vale " + rettangolo.perimetro());
        System.out.println("L'area del rettangolo vale " + rettangolo.area());
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2){
        System.out.println("Il perimetro del primo rettangolo vale " + rettangolo1.perimetro() + " e la sua area vale " + rettangolo1.area());
        System.out.println("Il perimetro del secondo rettangolo vale " + rettangolo2.perimetro() + " e la sua area vale " + rettangolo2.area());
        System.out.println("La somma dei perimetri vale " + (rettangolo1.perimetro() + rettangolo2.perimetro()));
        System.out.println("La somma delle aree vale " + (rettangolo1.area() + rettangolo2.area()));
    }
}
