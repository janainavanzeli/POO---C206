package Exercicios_2.Ex_Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Chamando o scanner
        Scanner entrada = new Scanner(System.in);

        // Criando objeto da clase aluno
        Aluno aluno_1 = new Aluno();

        System.out.println("Digite a matrícula do aluno: ");
        aluno_1.matricula = entrada.nextInt();

        System.out.println("Digite a NP1 do aluno: ");
        aluno_1.np1 = entrada.nextInt();

        System.out.println("Digite a NP2 do aluno: ");
        aluno_1.np2 = entrada.nextInt();

        System.out.println("Digite o período do aluno: ");
        aluno_1.periodo = entrada.nextInt();

        entrada.nextLine(); // Limpando para receber o nextline certo no nome
        System.out.println("Digite o nome do aluno: ");
        aluno_1.nome = entrada.nextLine();

        System.out.println("Calculando a média...");

        int media = aluno_1.calculaMedia();

        // Lógica
        if (media >= 60){
            System.out.println("Parabéns! o aluno " + aluno_1.nome + " foi aprovado");
        } else if (media < 20) {
            System.out.println("O aluno " + aluno_1.nome + " foi reprovado");
        } else {
            System.out.println("Vamos para a NP3...");
            int mediaComNP3 = aluno_1.calculaNP3(media);

            if (mediaComNP3 >= 60){
                System.out.println("Parabéns! o aluno " + aluno_1.nome + " foi aprovado");
            } else {
                System.out.println("O aluno " + aluno_1.nome + " foi reprovado");
            }
        }

        System.out.println("Informações do Aluno: ");
        System.out.println(aluno_1.toString());

        // Fechando o scanner
        entrada.close();
    }
}