package it.epicode.week1.progetto;

public class Video extends ElementoMultimediale implements ElementoRiproducibile{
    private int volume, luminosita;

    public Video(String titolo, int volume, int luminosita){
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void abbassaVolume(int quantita){
        volume = quantita > volume ? 0 : volume - quantita;
    }

    public void alzaVolume(int quantita){
        volume += quantita;
    }

    public void aumentaLuminosita(int quantita){
        luminosita += quantita;
    }

    public void diminuisciLuminosita(int quantita){
        luminosita = quantita > luminosita ? 0 : luminosita - quantita;
    }

    @Override
    public void play() {
        String puntiEsclamativi = "", asterischi = "";
        for (int i = 0; i < volume; i++) puntiEsclamativi += "!";
        for (int i = 0; i < luminosita; i++) asterischi += "*";
        for (int i = 0; i < durata; i++) System.out.println(getTitolo() + puntiEsclamativi + asterischi);
    }

    @Override
    public void riproduci() {
        play();
    }
}
