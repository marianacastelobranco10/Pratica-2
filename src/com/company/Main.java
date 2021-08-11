package com.company;

public class Main {
    public static void main(String[] args) {


        double lado = 5.0;
        Quadrado quadrado = new Quadrado(lado);
        System.out.println(("Lado do quadrado vale:" + lado));
        System.out.println("Área do quadrado: " + quadrado.area());
        System.out.println("Perímetro do quadrado: " + quadrado.perimetro());

        double base = 12;
        double altura = 18;
        Retangulo retangulo = new Retangulo(base, altura);
        System.out.print("Base" + base + "Altura:" + altura);
        System.out.println("Area Retangulo:" + retangulo.area());
        System.out.println("Perimetro retangulo:" + retangulo.perimetro());

        double raio = 2;
        Circulo circulo = new Circulo(raio);
        System.out.println("Raio: " + raio);
        System.out.println("Perimetro do circulo: " + circulo.perimetro());
        System.out.println("Area do circulo: " + circulo.area());
    }
}
