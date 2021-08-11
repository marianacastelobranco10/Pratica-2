package com.company;

public class Retangulo implements Calc_Area{


    double base, altura;
    public Retangulo(double base, double altura){
    this.base = base;
    this.altura = altura;

    }

    @Override
    public double perimetro() {
        return (2* base + 2*altura);
    }

    @Override
    public double area() {
        return (base * altura);
    }
}
