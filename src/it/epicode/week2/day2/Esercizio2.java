package it.epicode.week2.day2;

import java.util.*;

public class Esercizio2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = funzione1();

        System.out.println(lista);
        System.out.println(funzione2(lista));
        funzione3(lista, true);
        funzione3(lista, false);
    }

    public static ArrayList<Integer> funzione1(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Inserisci N");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) lista.add(random.nextInt(101));

        Integer[] arr = lista.toArray(new Integer[lista.size()]);

        Arrays.sort(arr);

        return new ArrayList<>(Arrays.asList(arr));
    }

    public static ArrayList<Integer> funzione2(ArrayList<Integer> lista){
        for (int i = lista.size() - 1; i >= 0; i--) {
            lista.add(lista.get(i));
        }

        return lista;
    }

    public static void funzione3(ArrayList<Integer> lista, boolean bool){
        int start = bool ? 0 : 1;
        System.out.println("\n");

        for (int i = start; i < lista.size(); i += 2) {
            System.out.println(lista.get(i));
        }
    }
}
