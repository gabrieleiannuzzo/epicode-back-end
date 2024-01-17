package it.epicode.week2.day2;

import java.util.HashSet;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> parole = new HashSet<>();
        HashSet<String> paroleDuplicate = new HashSet<>();
        int paroleDistinte = 0;

        System.out.println("Inserisci N");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci una parola");
            String parola = scanner.nextLine();
            if (parole.add(parola)) {
                paroleDistinte++;
            } else {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate: " + paroleDuplicate + "\nNumero parole distinte: " + parole.size() + "\nParole distinte: " + parole);
    }
}
