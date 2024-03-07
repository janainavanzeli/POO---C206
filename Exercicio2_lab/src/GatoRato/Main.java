package Exercicio_2.GatoRato;

public class Main {
    public static void main(String[] args) {
        // Criando objetos das duas classes
        Gato gato_1 = new Gato();
        Gato gato_2 = new Gato();

        Rato rato_1 = new Rato();
        Rato rato_2 = new Rato();

        System.out.println("Iniciando..");

        // Atribuindo valores aos atributos
        gato_1.cor = "Amarelo";
        gato_1.idade = 5;
        gato_1.velocidade = 34;

        gato_2.cor = "Branco";
        gato_2.idade = 8;
        gato_2.velocidade = 12;

        rato_1.velocidade = 23;
        rato_1.escondido = false;

        rato_2.velocidade = 5;
        rato_2.escondido = false;

        // Chamando metodos
        rato_1.esconder();
        gato_1.cacar(rato_1);

        rato_1.procurarComida();
        gato_2.cacar(rato_2);

        System.out.println("\n-----Gatos-----");
        System.out.println(gato_1.toString());
        System.out.println(gato_2.toString());

        System.out.println("\n-----Ratos-----");
        System.out.println(rato_1.toString());
        System.out.println(rato_2.toString());
    }
}