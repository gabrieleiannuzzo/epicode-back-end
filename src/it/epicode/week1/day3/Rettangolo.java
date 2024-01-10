package it.epicode.week1.day3;

public class Rettangolo {
    private double h, b;

    public Rettangolo(double h, double b){
        this.b = b;
        this.h = h;
    }

    public double getB(){
        return this.b;
    }

    public double getH(){
        return this.h;
    }

    public double perimetro(){
        return 2 * (this.b + this.h);
    }

    public double area(){
        return this.b * this.h;
    }
}
