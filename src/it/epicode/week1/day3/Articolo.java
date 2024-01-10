package it.epicode.week1.day3;

public class Articolo {
    private int codice, quantitaDisponibile;
    private String descrizione;
    private double prezzo;

    public Articolo(int codice, String descrizione, double prezzo, int quantitaDisponibile){
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;
    }
}
