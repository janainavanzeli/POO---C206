package Exercicio_2.Jogador;

public class Main {
    public static void main(String[] args) {
        Arma arma_1 = new Arma(32, 12);
        Arma arma_2 = new Arma(14, 33);
        Arma arma_3 = new Arma(20, 25);
        Arma arma_4 = new Arma(5, 10);

        Jogador player_1 = new Jogador(arma_1, 300, 98);
        Jogador player_2 = new Jogador(arma_3, 50, 150);
        Jogador player_3 = new Jogador(arma_4, 9, 16);

        player_1.atacar(player_2);

        System.out.println(player_1.toString());
        System.out.println(player_2.toString());



    }
}