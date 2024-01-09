package it.epicode.week1.day2;

import java.util.Scanner;

public class Sconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il prezzo");
        double prezzo = scanner.nextDouble();
        int sconto;

        if (prezzo < 30) {
            sconto = 12;
        } else {
            sconto = 25;
        }

        System.out.println("Il prezzo scontato è " + (prezzo - (prezzo * sconto / 100)) + "€");
    }
}
