package it.epicode.week1.progetto;

import java.util.Scanner;

public class ProgettoEsteso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] em = new ElementoMultimediale[5];

        for (int i = 0; i < em.length; i++) creaElementoMultimediale(i, em);

        while (true) {
            System.out.println("Inserisci un numero da 1 a 5 per scegliere l'elemento da riprodurre, oppure 0 per chiudere il programma: ");
            int scelta = scanner.nextInt();
            if (scelta == 0) break;
            if (scelta > 5 || scelta < 0) continue;
            em[scelta-1].riproduci();
        }
    }

    public static void creaElementoMultimediale(int i, ElementoMultimediale[] em){
        Scanner scanner = new Scanner(System.in);

        int scelta;
        do {
            System.out.println((i+1) + "/" + em.length + ") Inserisci il tipo di elemento che vuoi creare (1 per un audio, 2 per un video, 3 per un immagine): ");
            scelta = scanner.nextInt();
            scanner.nextLine();
        } while (scelta < 1 || scelta > 3);

        System.out.println("Inserisci il titolo: ");
        String titolo = scanner.nextLine();

        gestisciElementoMultimediale(scelta, titolo, i, em);
    }

    public static void gestisciElementoMultimediale(int scelta, String titolo, int i, ElementoMultimediale[] em){
        Scanner scanner = new Scanner(System.in);

        switch (scelta) {
            case 1:
                int volume1;
                do {
                    System.out.println("Inserisci il volume");
                    volume1 = scanner.nextInt();
                } while (volume1 < 0);
                em[i] = new Audio(titolo, volume1);
                break;
            case 2:
                int volume2, luminosita2;
                do{
                    System.out.println("Inserisci il volume");
                    volume2 = scanner.nextInt();
                } while (volume2 < 0);
                do{
                    System.out.println("Inserisci la luminosità");
                    luminosita2 = scanner.nextInt();
                } while (luminosita2 < 0);
                em[i] = new Video(titolo, volume2, luminosita2);
                break;
            case 3:
                int luminosita3;
                do{
                    System.out.println("Inserisci la luminosità");
                    luminosita3 = scanner.nextInt();
                } while (luminosita3 < 0);
                em[i] = new Immagine(titolo, luminosita3);
        }

        System.out.println();
    }
}
