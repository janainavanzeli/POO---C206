package AV1;

public class Robo {
    private int energia;
    private string nome;
    private int totalDeRobos; // contador
    private int energiaMaxima;

    // getter, setter e constructor
    public Robo(int energia, string nome, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.energiaMaxima = energiaMaxima;

       // energiaMaxima;
    }

    public int getEnergia() {
        return energia;
    }
    public int setEnergia () {
        return energia;
    }
    public void trocarEnergia(Robo roboAlvo){

    }

    public void trabalhar(){
        System.out.println("Reduzindo energia");
        setEnergia(getEnergia() - 15);
    }

    public void recarregar(int horas){
        //
        System.out.println("Recarregando");
        setEnergia(getEnergia() + 10);
    }

    @Override
    public String toString() {
        return  "\n   energia=" + energia +
                "\n   nome=" + nome +
                "\n   energia maxima=" + energiaMaxima +
                "\n   total de robos=" + totalDeRobos +
                "\n}";
    }
}
































