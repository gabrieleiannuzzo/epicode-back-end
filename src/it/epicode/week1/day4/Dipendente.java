package it.epicode.week1.day4;

public class Dipendente {
    private double stipendioBase = 1000, stipendio, importoOrarioStraordinario;
    private long matricola;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(long matricola, Dipartimento dipartimento){
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        stipendio = stipendioBase;
        importoOrarioStraordinario = 30;
        livello = Livello.OPERAIO;
    }

    public Dipendente(long matricola, Dipartimento dipartimento, double stipendio, double importoOrarioStraordinario, Livello livello){
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public long getMatricola() {
        return matricola;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void stampaDatiDipendente(){
        System.out.println("DATI DIPENDENTE:\nMatricola: " + matricola + "\nDipartimento: " + dipartimento + "\nStipendio: " + stipendio + "€\nImporto orario straordinario: " + importoOrarioStraordinario + "€\nLivello: " + livello);
    }

    public Livello promuovi(){
        Livello[] livelli = Livello.values();
        switch (livello) {
            case Livello.OPERAIO:
                stipendio = stipendioBase * 1.2;
                break;
            case Livello.IMPIEGATO:
                stipendio = stipendioBase * 1.5;
                break;
            case Livello.QUADRO:
                stipendio = stipendioBase * 2;
                break;
        }
        if (livello != Livello.DIRIGENTE) {
            livello = livelli[livello.ordinal() + 1];
        } else {
            System.out.println("Non puoi promuovere un dirigente");
        }
        return livello;
    }

    public static double calcolaPaga(Dipendente dipendente){
        return dipendente.stipendio;
    }

    public static double calcolaPaga(Dipendente dipendente, int oreStraordinario){
        return dipendente.stipendio + (oreStraordinario * dipendente.importoOrarioStraordinario);
    }
}
