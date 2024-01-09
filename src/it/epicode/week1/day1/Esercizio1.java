package it.epicode.week1.day1;

public class Esercizio1 {
    public static void main(String[] args){
        System.out.println(moltiplica(1, 2));
        System.out.println(concatena("Oggi ho visto un ", 2));
        final String[] stringhe = {"1", "2", "3", "4", "5"};
        final String stringaDaAggiungere = "6";
        String[] arrayDaMetodo = inserisciInArray(stringhe, stringaDaAggiungere);
        for (int i = 0; i < arrayDaMetodo.length; i++) {
            System.out.println(arrayDaMetodo[i]);
        }
    }

    public static int moltiplica(int a, int b){
        return a * b;
    }

    public static String concatena(String str, int a){
        return str + a;
    }

    public static String[] inserisciInArray(String[] arr, String str){
        String[] nuovoArray = {arr[0], arr[1], str,arr[2], arr[3], arr[4]};
        return nuovoArray;
    }
}
