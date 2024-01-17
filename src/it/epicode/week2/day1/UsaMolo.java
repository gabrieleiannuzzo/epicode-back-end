package it.epicode.week2.day1;

public class UsaMolo {
    public static void main(String[] args) {
        Molo molo = Molo.crea("Primo molo", 6);
        try {
            molo.assegnaPostoBarca(1, "Barca uno");
        } catch (PostoOccupatoException ex) {
            System.out.println("Molo occupato");
        }
        try {
            molo.assegnaPostoBarca(1, "Barca uno");
        } catch (PostoOccupatoException ex) {
            System.out.println(ex);
        }
    }
}
