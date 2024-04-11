package AV1;

import java.util.Arrays;

public class Empilhador extends Robo{

    private int pesoMaximo;
    private Pacote[] pacotes = new Pacote[10];
    public Empilhador(int pesoMaximo){

    public void adicionaPacote(int peso) {
        for (int i = 0; i < pacotes.length; i++) {
            if (pacotes[i] == null) {
                pacotes[i] = new Pacote(nome, peso);
                return true;
            }
            System.out.println("Pacote adicionado");
        }
        return false;
    }

    public void removePacote(int posicao) {
        for (int i = 0; i < pacotes.length; i++) {
            if (pacotes[i] == null) {
                pacotes[i] = new Pacote(nome, posicao);
            }
            System.out.println("Pacote removido");
        }
    }
    public void mostraPacote(){
        for (Pacote pacote : pacotes) {
            if (pacote != null) {
                System.out.println(pacote);
            }
        }
    }
    @Override
    public String toString() {
        return  "\nEmpilhador{" +
                "\n   pacotes=" + Arrays.toString(pacotes) +
                super.toString();
    }
}







































