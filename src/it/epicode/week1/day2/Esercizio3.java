package it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        do {
            System.out.println("Inserisci la stringa");
            str = scanner.nextLine();

            if (str.equals(":q")) break;
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + ",");
            }
            System.out.println();
        } while (!str.equals(":q"));
    }
}
