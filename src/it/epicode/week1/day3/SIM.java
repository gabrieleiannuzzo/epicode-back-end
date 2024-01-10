package it.epicode.week1.day3;

public class SIM {
    private int numero;
    private double costoPerMinuto, credito = 0;
    private Chiamata[] chiamate = new Chiamata[5];

    public SIM(int numero, double costoPerMinuto){
        this.numero = numero;
        this.costoPerMinuto = costoPerMinuto;
    }

    public boolean chiamata(int secondi, int numeroChiamato){
        int minuti = (secondi % 60 == 0) ? (secondi / 60) : (((secondi - (secondi % 60)) / 60) + 1);
        if ((minuti * this.costoPerMinuto) > this.credito) return false;

        this.ricarica(-(minuti * this.costoPerMinuto));
        if (this.chiamate[4] != null) {
            for (int i = 0; i < this.chiamate.length; i++) {
                if (this.chiamate[i] == null) {
                    this.chiamate[i] = new Chiamata(numeroChiamato, secondi);
                    return true;
                }
            }
        }
        for (int i = 0; i < this.chiamate.length - 1; i++) {
            this.chiamate[i + 1] = this.chiamate[i];
        }
        this.chiamate[0] = new Chiamata(numeroChiamato, secondi);
        return true;
    }

    public void ricarica(double importo){
        this.setCredito(this.getCredito() + importo);
    }

    public double getCredito() {
        return credito;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public double getCostoPerMinuto() {
        return costoPerMinuto;
    }

    public int getNumero() {
        return numero;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
