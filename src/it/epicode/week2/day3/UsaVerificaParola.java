package it.epicode.week2.day3;

public class UsaVerificaParola {
    public static void main(String[] args) {
        VerificaParola verificaParola = (parola, lunghezza) -> parola.length() > lunghezza;

        System.out.println(verificaParola.verifica("miao", 587));
    }
}
