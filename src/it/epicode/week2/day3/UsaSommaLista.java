package it.epicode.week2.day3;

import java.util.List;

public class UsaSommaLista {
    public static void main(String[] args) {
        SommaLista sommaLista = list -> {
            double totale = 0;
            for (double el:list) totale += el;
            return totale;
        };

        List<Double> lista = List.of(1.0, 2.3, 3.1);
        System.out.println(sommaLista.sommaLista(lista));
    }
}
