public class Carro {
    private int tipoDePneu;
    private int potencia;
    private boolean turbo;
    private Motor motor;

    public Carro(int tipoDePneu, int potencia, boolean turbo) {
        this.tipoDePneu = tipoDePneu;
        this.potencia = potencia;
        this.turbo = turbo;
        this.motor = new Motor(potencia, turbo);
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
