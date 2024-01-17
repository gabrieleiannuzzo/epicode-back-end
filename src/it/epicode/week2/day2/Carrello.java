package it.epicode.week2.day2;

import java.util.LinkedList;

public class Carrello {
    private LinkedList<Articolo> carrello;

    public Carrello(){
        carrello = new LinkedList<>();
    }

    public void aggiungiArticolo(Articolo articolo){
        carrello.add(articolo);
    }

    public void stampaArticoli(){
        System.out.println(carrello);
    }

    public double totale(){
        double prezzoTotale = 0;

        for (Articolo articolo:carrello) {
            prezzoTotale += articolo.getPrezzo();
        }

        return prezzoTotale;
    }
}
