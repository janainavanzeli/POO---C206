package AV1;
public class Garra {

    private int pressao;

    public Garra(int pressao) {
        this.pressao = pressao;
    }
    public void agarrarPeca(int posicao) {
        System.out.println("");

    }
    @Override
    public String toString() {
        return "Garra{" +
                ", pressao=" + pressao +
                '}';
    }
}