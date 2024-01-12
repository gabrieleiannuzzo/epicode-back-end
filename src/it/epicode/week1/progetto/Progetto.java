package it.epicode.week1.progetto;

import java.util.Scanner;

public class Progetto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] em = new ElementoMultimediale[5];

        em = creaArray(5);

        while(true){
            System.out.println("Inserisci un numero da 1 a 5 per scegliere l'elemento da riprodurre, oppure 0 per chiudere il programma: ");
            int scelta = scanner.nextInt();
            if (scelta == 0) break;
            if (scelta > 5 || scelta < 0) continue;
            em[scelta-1].riproduci();
        }
    }

    public static ElementoMultimediale[] creaArray(int length){
        ElementoMultimediale[] em = new ElementoMultimediale[length];
        for (int i = 0; i < length; i++) em[i] = creaElementoMultimediale(selezionaElementoMultimediale());
        return em;
    }

    public static int selezionaElementoMultimediale(){
        Scanner scanner = new Scanner(System.in);
        int scelta = 0;
        while (scelta < 1 || scelta > 3) {
            System.out.println("Inserisci il tipo di elemento che vuoi creare (1 per un audio, 2 per un video, 3 per un immagine: ");
            scelta = scanner.nextInt();
            scanner.nextLine();
        }
        return scelta;
    }

    public static ElementoMultimediale creaElementoMultimediale(int scelta){
        Scanner scanner = new Scanner(System.in);
        String titolo;
        System.out.println("Inserisci il titolo: ");
        titolo = scanner.next();

        String[] stringhe = {"il volume", "la luminosita"};
        int valori;

        switch(scelta){
            case 1,2:
                valori = scelta;
                break;
            default:
                valori = 1;
        }

        int[] valoriScelti = new int[valori];
        for (int i = 0; i < valori; i++) {
            do {
                System.out.println("Scegli " + stringhe[i]);
                valoriScelti[i] = scanner.nextInt();
            } while (valoriScelti[i] < 0);
            System.out.println();
        }

        switch (scelta) {
            case 1:
                return new Audio(titolo, valoriScelti[0]);
            case 2:
                return new Video(titolo, valoriScelti[0], valoriScelti[1]);
            case 3:
                return new Immagine(titolo, valoriScelti[0]);
        }

        return new Audio("Audio di default", 0);
    }
}
