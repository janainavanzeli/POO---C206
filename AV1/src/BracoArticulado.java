package AV1;

import java.util.Arrays;

public class bracoArticulado extends Robo{
    private int numeroDeArticulacoes;
    private Garra[] garra = new Garra[];
    private Camera[] camera = new Camera[];

    public bracoArticulado(int numeroDeArticulacoes){
        this.numeroDeArticulacoes = numeroDeArticulacoes;
    }

    @Override
    public String toString() {
        return  "\nEmpilhador{" +
                "\n   pacotes=" + Arrays.toString(pacotes) +
                super.toString();
    }
}







































