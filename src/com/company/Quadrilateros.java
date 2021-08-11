package com.company;

public abstract class Quadrilateros implements Calc_Area{

    private final double lado1;
    private final double lado2;
    private final double lado3;
    private final double lado4;

    public Quadrilateros(double ladoUm, double ladoDois, double ladoTres, double ladoQuadro){
        this.lado1 = ladoUm;
        this.lado2 = ladoDois;
        this.lado3 = ladoTres;
        this.lado4 = ladoQuadro;

    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3 +lado4;
    }

    @Override
    public double area() {
        return 0;
    }



//    public static class Quadrado {
//        double Lado;
//        public Quadrado(double lado){
//            this.Lado = lado;
//        }
//    }
}
