package it.epicode.week1.day2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ordinali = {"primo", "secondo", "terzo", "quarto", "quinto", "sesto", "settimo", "ottavo", "nono", "decimo"};
        int[] numeriScelti = new int[10];
        double totale = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci il " + ordinali[i] + " numero");
            totale += scanner.nextInt();
        }

        double media = totale / 10;

        System.out.println("La media aritmetica tra i numeri che hai inserito è " + media);
    }
}
