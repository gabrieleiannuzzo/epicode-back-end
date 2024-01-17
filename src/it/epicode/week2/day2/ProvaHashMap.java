package it.epicode.week2.day2;

import java.util.HashMap;

public class ProvaHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Articolo> inventario = new HashMap<>();

        Articolo a1 = new Articolo("quaderno", "consumabili", 1);
        Articolo a2 = new Articolo("penna", "consumabili", 0.50);
        Articolo a3 = new Articolo("gomma", "consumabili", 1);

        inventario.put(1, a1);
        inventario.put(2, a2);
        inventario.put(3, a3);

        System.out.println(inventario);
    }
}
