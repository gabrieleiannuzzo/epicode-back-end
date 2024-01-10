package it.epicode.week1.day3;

public class Esercizio2 {
    public static void main(String[] args) {
        SIM sim = new SIM(385, 0.2);
        sim.ricarica(20);
        if (sim.chiamata(99, 1)) {
            System.out.println("Chiamata effettuata con successo. Nuovo credito; " + sim.getCredito() + "€");
        } else {
            System.out.println("Credito insufficiente: " + sim.getCredito() + "€");
        }

        Chiamata[] chiamate = sim.getChiamate();
        System.out.println("\nREGISTRO CHIAMATE");
        for (int i = 0; i < chiamate.length; i++) {
            if (chiamate[i] == null) break;
            System.out.println("Chiamata a " + chiamate[i].getNumeroChiamato() + ". Durata: " + chiamate[i].getSecondi() + "s");
        }
    }
}
