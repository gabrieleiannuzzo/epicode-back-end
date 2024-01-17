package it.epicode.week2.day1;

public class PostoOccupatoException extends Exception {
    public PostoOccupatoException(String testo){
        super(testo);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
}
