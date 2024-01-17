package it.epicode.week2.day1;

public class UsaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();

        try {
            System.out.println(aritmetica.divisione(7, 0));
        } catch (ArithmeticException ex){
            System.out.println("Non puoi dividere per 0");
        }
    }
}
