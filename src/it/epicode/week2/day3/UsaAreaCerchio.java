package it.epicode.week2.day3;

public class UsaAreaCerchio {
    public static void main(String[] args) {
        AreaCerchio areaCerchio = r -> Math.PI * r * r;

        System.out.println(areaCerchio.area(12));
    }
}
