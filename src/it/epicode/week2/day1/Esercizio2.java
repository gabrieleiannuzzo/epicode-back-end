package it.epicode.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = LoggerFactory.getLogger("Esercizio2");

        System.out.println("Inserisci i chilometri percorsi");
        double km = scanner.nextDouble();
        System.out.println("Inserisci i litri utilizzati");
        double l = scanner.nextDouble();

        try {
            System.out.println("Hai viaggiato con un consumo di " + kmL(km, l) + "km/l");
        } catch (KmLException ex){
            logger.error("Non puoi inserire 0 litri");
            System.out.println(ex.getMessage());
        }
    }

    public static double kmL(double km, double l) throws KmLException{
        if (l == 0) throw  new KmLException("Non puoi inserire 0 litri");
        return km / l;
    }
}
