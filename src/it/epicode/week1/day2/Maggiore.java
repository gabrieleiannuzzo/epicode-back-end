package it.epicode.week1.day2;

import java.util.Scanner;

public class Maggiore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo valore");
        int a = scanner.nextInt();
        System.out.println("Inserisci il secondo valore");
        int b = scanner.nextInt();
        System.out.println("Inserisci il terzo valore");
        int c = scanner.nextInt();

        System.out.println("Il numero maggiore tra i 3 inseriti è " + calcolaMaggiore(a, b, c));
    }

    public static int calcolaMaggiore(int a, int b, int c){
        if (a > b && a > c) return a;
        if (b > c) return b;
        return c;
    }
}
