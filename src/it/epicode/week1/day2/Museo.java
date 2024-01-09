package it.epicode.week1.day2;

import java.util.Scanner;

public class Museo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci l'opzione desiderata");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                System.out.println("Il biglietto è gratuito");
                break;
            case 2:
                System.out.println("Il biglietto costa 8€");
                break;
            case 3:
                System.out.println("Il biglietto costa 10€");
                break;
            case 4:
                System.out.println("Il biglietto costa 15€");
                break;
            default:
                System.out.println("Scelta non valida");
        }
    }
}
