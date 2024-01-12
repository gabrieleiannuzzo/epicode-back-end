package it.epicode.week1.progetto;

import java.util.Scanner;

public class Progetto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Dichiarazione dell'array di 5 elementi di tipo ElementoMultimediale
        ElementoMultimediale[] em = new ElementoMultimediale[5];

        // Chiamata al metodo che crea gli array
        creaArray(em);

        // Permetto all'utente di far riprodurre un elemento quante volte vuole, finchè non preme 0
        while(true){
            System.out.println("Inserisci un numero da 1 a 5 per scegliere l'elemento da riprodurre, oppure 0 per chiudere il programma: ");
            int scelta = scanner.nextInt();
            // Se preme 0, il programma mi esce dal while
            if (scelta == 0) break;
            // Se preme un valore non compreso nell'intervallo delle scelte, il while riparte dalla prima istruzione
            if (scelta > 5 || scelta < 0) continue;
            // Se l'utente inserisce un valore corretto (posto che eventuali valori di tipo errato vengano gestiti direttamente da Java) viene riprodotto l'elemento
            em[scelta-1].riproduci();
        }
    }

    /* Metodo che utilizza i due metodi sotto per creare un singolo elemento multimediale. Passo come parametro
    l'array per far si che venga ciclato e ad ogni suo elemento sia assegnato un elemento multimediale */
    public static void creaArray(ElementoMultimediale[] em){
        for (int i = 0; i < em.length; i++) em[i] = selezionaElementoMultimediale(i, em.length);
    }

    /* Questo metodo serve a gestire la scelta dell'utente roguardo quale tipo di elemento multimediale da
    creare, in base alle 3 possibilità */
    public static ElementoMultimediale selezionaElementoMultimediale(int i, int length){
        Scanner scanner = new Scanner(System.in);
        int scelta;
        // Ripeto la richiesta finchè l'utente non inserisce un valore accettato
        do {
            System.out.println((i+1) + "/" + length + ") Inserisci il tipo di elemento che vuoi creare (1 per un audio, 2 per un video, 3 per un immagine): ");
            scelta = scanner.nextInt();
            scanner.nextLine();
        } while (scelta < 1 || scelta > 3);
        // Ritorno l'elemento gestito dal prossimo metodo, a cui passo la scelta
        return creaElementoMultimediale(scelta);
    }

    public static ElementoMultimediale creaElementoMultimediale(int scelta){
        // Mi faccio passare il titolo dell'elemento (unica proprietà comune tra i 3 tipi di elementi multimediali)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo: ");
        String titolo = scanner.nextLine();

        // Questo array mi tornerà utile più tardi permettendomi di chiedere rapidamente all'utente "Inserisci ..."
        String[] stringhe = (scelta == 3) ? new String[]{"la luminosità"} : new String[]{"il volume", "la luminosità"};

        // Qui gestisco i valori da passare all'inizializzazione dell'elemento oltre al titolo
        int valori = (scelta == 2) ? 2 : 1;

        // Dichiaro un array di lunghezza pari al numero di valori da passare oltre al titolo, stabilito nello switch precedente
        int[] valoriScelti = new int[valori];
        // Per ogni valore richiesto uso lo scanner, e l'array stringhe mi torna utile per chiedere rapidamente i valori all'utente
        for (int i = 0; i < valori; i++) {
            do {
                System.out.println("Inserisci " + stringhe[i]);
                valoriScelti[i] = scanner.nextInt();
            } while (valoriScelti[i] < 0);
        }
        // Mando a capo solo per una questione estetica
        System.out.println();

        // In base alla scelta fatta, istanzio l'oggetto corrispondente con il giusto numero di parametri da passare
        switch (scelta) {
            case 1:
                return new Audio(titolo, valoriScelti[0]);
            case 2:
                return new Video(titolo, valoriScelti[0], valoriScelti[1]);
            case 3:
                return new Immagine(titolo, valoriScelti[0]);
        }

        /* Java considera lo switch un controllo limitato poichè non sa che io ho comunque inserito tutti i controlli
        necessari affinchè gli unici 3 possibili valori passati siano 1, 2 o 3. Dunque faccio un return che però si rivela
        inutile e mai utilizzato dal programma */
        return null;
    }

    /* ESEMPIO PRATICO:
    scelta == 1: viene passato al metodo successivo. La variabile valori sarà 1 e l'array valoriScelti avrà 1 solo elemento.
    Il ciclo farà una sola iterazione e chiederà "Inserisci " + il valore di stringhe alla prima posizione (0), quindi "il volume".
    Istanzio un audio

    scelta == 2: si aggiunge un elemento a valoriScelti e il programma chiederà all'utente "Inserisci " + "il volume" e poi
    "Inserisci " + "la luminosità". Istanzio un video

    scelta == 3: come nel caso di scelta == 1, con l'accortezza di sostituire "il volume" con "la luminosità" nell'array stringhe
    */
}
