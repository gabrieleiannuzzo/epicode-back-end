package it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un intero");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 0:
                System.out.println("Il numero scelto è zero");
                break;
            case 1:
                System.out.println("Il numero scelto è uno");
                break;
            case 2:
                System.out.println("Il numero scelto è due");
                break;
            case 3:
                System.out.println("Il numero scelto è tre");
                break;
            default:
                System.out.println("Il numero scelto è " + scelta);
        }
    }
}
