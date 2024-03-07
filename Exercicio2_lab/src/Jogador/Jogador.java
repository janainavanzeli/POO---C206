package Exercicio_2.Jogador;

public class Jogador {
    Arma arma;
    int energia;
    int vida;

    public void atacar(Jogador alvo){
        if (this.energia >= this.arma.custoDeEnergia){ // Verificando quantidade de energia
            alvo.vida -= this.arma.dano;
            this.energia -= this.arma.custoDeEnergia;
        }else {
            System.out.println("Energia insuficiente");
        }
    }

    Jogador(){
        System.out.println("Faz nada!");
    }
    Jogador(Arma arma, int energia, int vida){
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    public String toString(){
        return
                "\nDano da arma: " + arma.dano +
                        "\nCusto de energia da arma: " + arma.custoDeEnergia +
                        "\nEnergia: " + energia +
                        "\nVida: " + vida;
    }
}
