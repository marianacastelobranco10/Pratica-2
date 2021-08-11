package com.company;

public class Quadrado implements Calc_Area{

    private final double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}
