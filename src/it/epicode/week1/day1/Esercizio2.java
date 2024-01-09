package it.epicode.week1.day1;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final String stringa1, stringa2, stringa3;

        System.out.println("Dammi la prima stringa");
        stringa1 = scanner.nextLine();
        System.out.println("Dammi la seconda stringa");
        stringa2 = scanner.nextLine();
        System.out.println("Dammi la terza stringa");
        stringa3 = scanner.nextLine();

        System.out.println(stringa1 + stringa2 + stringa3);
        System.out.println(stringa3 + stringa2 + stringa1);
    }
}
