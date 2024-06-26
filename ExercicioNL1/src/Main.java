public class Main {
    public static void main(String[] args) {

        Equipe equipe =  new Equipe("Azul");

        Piloto piloto1 = new Piloto("Carlos Abate", 25, "Italiano");
        Piloto piloto2 = new Piloto("Andrea de Adamich", 34, "Italiano");
        Piloto piloto4 = new Piloto("Rubens Barrichello", 43, "Brasileiro");
        Piloto piloto5 = new Piloto("Ricardo Zonta", 65, "Brasileiro");

        equipe.constroiCarro(2, 600,true);

        equipe.adicionarPiloto(piloto1);
        equipe.adicionarPiloto(piloto2);
        equipe.adicionarPiloto(piloto3);
        equipe.adicionarPiloto(piloto4);

        equipe.trocarPilotoAtual(1);
        equipe.pitStop(4, 2);

        equipe.retirarPiloto(3);
        equipe.adicionarPiloto(new Piloto("Sebastian Vettel", 36, "Alemão"));

        System.out.println(equipe.toString());

    }
}