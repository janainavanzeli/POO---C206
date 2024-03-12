package Exercicios3_lab;

public class Main {
    public static void main(String[] args) {

        float raio = 45.89F;
        float altura = 60.08F;

        System.out.println(Calculadora.circunferencia(raio));
        System.out.println(Calculadora.volumeEsfera(raio));
        System.out.println(Calculadora.volumeCilindro(raio, altura));
    }
}