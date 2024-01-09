package it.epicode.week1.day1;

public class PrimaClasse {
    public static void main(String[] args) {
        System.out.println(moltiplica(1, 2));
        System.out.println(concatena("Oggi ho visto un ", 2));
    }

    public static int moltiplica(int a, int b){
        return a * b;
    }

    public static String concatena(String str, int a){
        return str + a;
    }

    public static String[] inserisciInArray(String[] arr, String str){
        arr[6] = arr[5];
        arr[5] = arr[4];
        arr[4] = str;
        return arr;
    }
}