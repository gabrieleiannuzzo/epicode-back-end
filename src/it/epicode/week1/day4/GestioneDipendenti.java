package it.epicode.week1.day4;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(1, Dipartimento.PRODUZIONE, 1200, 20, Livello.OPERAIO);
        Dipendente dipendente2 = new Dipendente(2, Dipartimento.PRODUZIONE, 1200, 20, Livello.OPERAIO);
        Dipendente dipendente3 = new Dipendente(3, Dipartimento.AMMINISTRAZIONE, 1500, 30, Livello.IMPIEGATO);
        Dipendente dipendente4 = new Dipendente(4, Dipartimento.VENDITE, 1800, 50, Livello.DIRIGENTE);

        dipendente1.promuovi();
        dipendente3.promuovi();

        dipendente1.stampaDatiDipendente();
        dipendente2.stampaDatiDipendente();
        dipendente3.stampaDatiDipendente();
        dipendente4.stampaDatiDipendente();

        System.out.println("La somma degli stipendi di tutti e 4 i dipendenti, calcolando 5 ore di straordinario ciascuno, vale " + (Dipendente.calcolaPaga(dipendente1, 5) + Dipendente.calcolaPaga(dipendente2, 5) + Dipendente.calcolaPaga(dipendente3, 5) + Dipendente.calcolaPaga(dipendente4, 5)) + "€");
    }
}
