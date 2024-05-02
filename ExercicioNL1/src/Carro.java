public class Carro {

    private int tipoDePneu;
    private Motor motor;
    public Carro(int tipoDePneu, int potencia, boolean turbo) {
        motor = new Motor(potencia, turbo);
        this.tipoDePneu = tipoDePneu;
    }

    public Motor getMotor() {
        return motor;
    }
    public int getTipoDePneu() {
        return tipoDePneu;
    }

    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }

    public void correr(){
        System.out.println("O carro está pronto para a corrida!");
    }



    @Override
    public String toString() {
        return "\n" +
                "Detalhes do motor: " + motor +
                "\n TipoDePneu: " + tipoDePneu;
    }
}
