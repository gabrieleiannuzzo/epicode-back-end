package it.epicode.week1.day2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci i numeri di cui calcolare la media");
        double somma = 0;
        int contatore = 0;
        int numero = 50;

        do {
            numero = scanner.nextInt();
            somma += numero;
            contatore++;
        } while (numero != 0);

        double media = somma / (contatore - 1);

        System.out.println("La media dei numeri inseriti vale " + media);
    }
}
