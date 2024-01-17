package it.epicode.week2.day2;

import java.util.Objects;

public class Articolo {
    private String titolo, categoria;
    private double prezzo;

    public Articolo(String titolo, String categoria, double prezzo){
        this.titolo = titolo;
        this.categoria = categoria;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "titolo='" + titolo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articolo articolo = (Articolo) o;
        return Double.compare(prezzo, articolo.prezzo) == 0 && Objects.equals(titolo, articolo.titolo) && Objects.equals(categoria, articolo.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo, categoria, prezzo);
    }
}
