public class Main {
    public static void main(String[] args) {

        Equipe equipe =  new Equipe("Azul");

        Piloto piloto1 = new Piloto("Carlos Abate", 25, "Italiano");
        Piloto piloto2 = new Piloto("Andrea de Adamich", 34, "Italiano");
        Piloto piloto3 = new Piloto("Fernando Alonso", 36, "Espanhol");
        Piloto piloto4 = new Piloto("Rubens Barrichello", 43, "Brasileiro");
        Piloto piloto5 = new Piloto("Ricardo Zonta", 65, "Brasileiro");

        equipe.constroiCarro(2, 600,true);


        //Adicionando os pilotos
        equipe.adicionarPiloto(piloto1);
        equipe.adicionarPiloto(piloto2);
        equipe.adicionarPiloto(piloto3);
        equipe.adicionarPiloto(piloto4);
        System.out.println();
        //Tentativa de cadastrar o piloto5
        equipe.adicionarPiloto(piloto5);

        //Definindo o piloto atual
        equipe.setPilotoAtual(piloto2);


        System.out.println();

        //Retirando o piloto da esquipe
        equipe.retirarPiloto(4);

        System.out.println();

        //Funçao do pitstop

        equipe.pitStop(5,1);

        //Trocar pneus
        //equipe.trocarPneu(3);

        //trocar piloto atual
        //equipe.trocarPilotoAtual(1);

        System.out.println();
        piloto1.correr(1);


        //Mostrando os dados do carro
        piloto1.correr(equipe.getCarro());

        System.out.println();

        //mostrando a equipe

        System.out.println(equipe);



    }
}