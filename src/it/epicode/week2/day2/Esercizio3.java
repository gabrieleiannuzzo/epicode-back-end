package it.epicode.week2.day2;

public class Esercizio3 {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.inserisciContatto("Gabriele", 1);
        rubrica.inserisciContatto("Mamma", 2);
        rubrica.inserisciContatto("Papà", 3);

        System.out.println(rubrica.numeroDaNome("Gabriele"));
    }
}
