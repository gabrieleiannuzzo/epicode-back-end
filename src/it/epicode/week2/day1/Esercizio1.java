package it.epicode.week2.day1;

import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio1 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Logger logger = LoggerFactory.getLogger("Esercizio1");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }

        while (true) {
            System.out.println("Inserisci la posizione dell'array da modificare: ");
            int posizione = scanner.nextInt();
            if (posizione < 0 || posizione > arr.length - 1) {
                logger.error("Indice non valido");
                throw new Exception("Non puoi inserire un valore non valido");
            }

            System.out.println("Inserisci il nuovo valore dell'array nella posizione specificata: ");
            int nuovoValore = scanner.nextInt();
            if (nuovoValore < 0 || nuovoValore > 10) {
                logger.error("Valore non valido");
                throw new Exception("Valore non valido");
            }
            if (nuovoValore == 0) return;
            arr[posizione] = nuovoValore;
            System.out.println();
        }
    }
}
