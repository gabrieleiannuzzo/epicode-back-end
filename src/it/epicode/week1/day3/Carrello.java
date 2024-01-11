package it.epicode.week1.day3;

public class Carrello {
    private int codiceCliente;
    private double prezzoTotale;
    private Articolo[] articoli;

    public Carrello(int codiceCliente, double prezzoTotale, Articolo[] articoli){
        this.codiceCliente = codiceCliente;
        this.prezzoTotale = prezzoTotale;
        this.articoli = articoli;
        //commento
    }
}
