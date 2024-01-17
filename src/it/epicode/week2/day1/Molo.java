package it.epicode.week2.day1;

public class Molo {
    private int numPostiBarca;
    private String codice;
    private String[] barche;

    private Molo(String codice, int numPostiBarca){
        this.codice = codice;
        this.numPostiBarca = numPostiBarca;
        barche = new String[numPostiBarca];
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public int getNumPostiBarca() {
        return numPostiBarca;
    }

    public void setNumPostiBarca(int numPostiBarca) {
        this.numPostiBarca = numPostiBarca;
    }

    public static Molo crea(String codice, int numPostiBarca){
        Molo molo = new Molo(codice, numPostiBarca);
        return molo;
    }

    public boolean libero(int n){
        return barche[n] == null;
    }

    public void assegnaPostoBarca(int n, String b) throws PostoOccupatoException{
        if (libero(n)) {
            barche[n] = b;
        } else {
            throw new PostoOccupatoException("Il posto " + n + " è occupato");
        }
    }
}
