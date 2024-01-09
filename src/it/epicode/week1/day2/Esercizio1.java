package it.epicode.week1.day2;

public class Esercizio1 {
    public static void main(String[] args) {
        String pariDispari = stringaPariDispari("ciao") ? "pari" : "dispari";
        System.out.println("La stringa è " + pariDispari);;

        String bisestile = annoBisestile(300) ? "è bisestile" : "non è bisestile";
        System.out.println("L'anno inserito " + bisestile);
    }

    public static boolean stringaPariDispari(String str){
        return (str.length() % 2 == 0);
    }

    public static boolean annoBisestile(int anno){
        return (((anno % 4 == 0) && (anno % 100 != 0)) || (anno % 400 == 0));
    }
}
