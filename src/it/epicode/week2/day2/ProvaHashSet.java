package it.epicode.week2.day2;

import java.util.HashSet;

public class ProvaHashSet {
    public static void main(String[] args) {
        HashSet<String> parole = new HashSet<>();

        parole.add("Udinese");
        parole.add("Sassuolo");
        parole.add("Cagliari");

        for (String s:parole) System.out.println(s);
    }
}
