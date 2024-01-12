package it.epicode.week1.progetto;

public class Immagine extends ElementoMultimediale{
    private int luminosita;

    public Immagine(String titolo, int luminosita){
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void aumentaLuminosita(int quantita){
        luminosita = quantita > luminosita ? 0 : luminosita - quantita;
    }

    public void diminuisciLuminosita(int quantita){
        luminosita += quantita;
    }

    public void show(){
        String asterischi = "";
        for (int i = 0; i < luminosita; i++) asterischi += "*";
        System.out.println(getTitolo() + asterischi);
    }

    @Override
    public void riproduci() {
        show();
    }
}
