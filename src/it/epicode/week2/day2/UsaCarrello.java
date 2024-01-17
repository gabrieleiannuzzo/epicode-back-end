package it.epicode.week2.day2;

public class UsaCarrello {
    public static void main(String[] args) {
        Carrello carrello = new Carrello();

        Articolo a1 = new Articolo("quaderno", "consumabili", 1);
        Articolo a2 = new Articolo("penna", "consumabili", 0.50);
        Articolo a3 = new Articolo("gomma", "consumabili", 1);

        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);
        carrello.aggiungiArticolo(a3);
        carrello.aggiungiArticolo(a2);

        carrello.stampaArticoli();

        System.out.println(carrello.totale());
    }
}
