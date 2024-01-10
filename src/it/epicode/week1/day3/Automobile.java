package it.epicode.week1.day3;

public class Automobile {
    public int cilindrata, porte;
    public String marca, nome, targa;
    public TipoAutomobile categoria;

    public Automobile(int cilindrata, String marca, String nome, String targa, int porte){
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.nome = nome;
        this.targa = targa;
        this.porte = porte;
    }

    public void accelera(){
        System.out.println("Sto accelerando");
    }

    public void decelera(){
        System.out.println("Sto rallentando");
    }
}
