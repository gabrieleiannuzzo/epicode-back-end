package it.epicode.week1.day3;

public class UsaAutomobile {
    public static void main(String[] args) {
        Automobile auto = new Automobile(6262, "Ferrari", "LaFerrari", "AA 000 AA", 3);
        auto.categoria = TipoAutomobile.BERLINA;

        auto.accelera();
        auto.decelera();
    }
}
