package it.epicode.week1.progetto;

public class Audio extends ElementoMultimediale implements ElementoRiproducibile{
    private int volume;

    public Audio(String titolo, int volume){
        super(titolo);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void abbassaVolume(int quantita){
        volume = (quantita > volume) ? 0 : (volume - quantita);
    }

    public void alzaVolume(int quantita){
        volume += quantita;
    }

    @Override
    public void play(){
        String puntiEsclamativi = "";
        for (int i = 0; i < volume; i++) puntiEsclamativi += "!";
        for (int i = 0; i < durata; i++) System.out.println(getTitolo() + puntiEsclamativi);
    }

    @Override
    public void riproduci() {
        play();
    }
}
