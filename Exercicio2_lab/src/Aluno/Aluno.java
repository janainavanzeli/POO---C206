package Exercicios_2.Ex_Aluno;

import java.util.Scanner;

public class Aluno {
    public int matricula;
    public int np1;
    public int np2;
    public int periodo;
    public String nome;


    public int calculaMedia(){
        return (np1+np2)/2;
    };

    public int calculaNP3(int media){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a nota da NP3: ");
        int notaNP3 = entrada.nextInt();

        return (notaNP3+media)/2;
    }

    public String toString(){
        return
                "\nMatrícula: " + matricula +
                        "\nPeríodo: " + periodo +
                        "\nNome: " + nome +
                        "\nNP1: " + np1 +
                        "\nNP2: " + np2;
    }
}