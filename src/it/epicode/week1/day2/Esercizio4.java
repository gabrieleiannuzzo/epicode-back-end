package it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero");
        int intero = scanner.nextInt();

        for (int i = intero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
