package it.epicode.week2.day2;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    private HashMap<String, Long> contatti;

    public Rubrica(){
        contatti = new HashMap<>();
    }

    public void inserisciContatto(String nome, long numero){
        contatti.put(nome, numero);
    }

    public void rimuoviContatto(String nome){
        contatti.remove(nome);
    }

    public String nomeDaNumero(long numero){
        Set<String> nomi = contatti.keySet();
        for (String nome:nomi) if (contatti.get(nome) == numero) return nome;
        return null;
    }

    public long numeroDaNome(String nome){
        return contatti.get(nome);
    }
}
