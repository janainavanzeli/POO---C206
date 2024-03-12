package Exercicios3_lab;

import static java.lang.Math.pow;

public class Calculadora {
    private static float PI = 3.14F;

    public static double circunferencia(double raio){
        return (2 * PI * raio);
    }
    public static double volumeEsfera(double raio){
        return ((4/3F) * PI * pow(raio, 3));
    }
    public static double volumeCilindro(double raio, float altura){
        return (PI * pow(raio, 2) * altura);
    }

}