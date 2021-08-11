package com.company;

public class Circulo implements Calc_Area{

    private final double raio;

    public Circulo(){
        this.raio = 1;
    }
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double perimetro() {
        double r2 = raio * raio;
        return 2 * Math.PI * r2;
    }

    @Override
    public double area() {
        double r2 = raio * raio;
        return Math.PI * r2;
    }
}
