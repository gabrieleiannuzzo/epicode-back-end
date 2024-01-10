package it.epicode.week1.day3;

import java.util.Date;

public class Cliente {
    private int codice;
    private long dataDiIscrizione;
    private String nome, cognome, email;

    public Cliente(int codice, long dataDiIscrizione, String nome, String cognome, String email){
        this.codice = codice;
        this.dataDiIscrizione = dataDiIscrizione;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }
}
