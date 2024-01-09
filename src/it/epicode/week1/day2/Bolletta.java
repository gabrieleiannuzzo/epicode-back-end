package it.epicode.week1.day2;

import java.util.Scanner;

public class Bolletta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di m^3 di acqua utilizzati");
        double metriCubi = scanner.nextDouble();
        System.out.println("La bolletta è di " + calcoloBolletta(50) + "€");
    }

    public static double calcoloBolletta(double metriCubi){
        int quotaFissa = 20, quotaDopo100 = 4;
        double quotaPrima100 = 2.5;

        if (metriCubi <= 100) {
            return (metriCubi * quotaPrima100) + quotaFissa;
        } else {
            return ((metriCubi - 100) * quotaDopo100) + (100 * quotaPrima100) + quotaFissa;
        }
    }
}
