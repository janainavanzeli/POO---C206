public class Piloto {
    private String nome;
    private int idade;
    private String nacionalidade;
    private static int IdGeral = 1;
    private int id;

    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.id= IdGeral;
        IdGeral++;
    }
    public void correr(Carro carro) {
        if (carro != null && carro.getMotor() != null) {
            System.out.println("Piloto " + nome + " está correndo com um carro de potência " + carro.getMotor().getPotencia() + " e tipo de pneu " + carro.getTipoDePneu() + ".");
        } else {
            System.out.println("Piloto " + nome + " não tem um carro para correr.");
        }
    }


    @Override
    public java.lang.String toString() {
        return "Piloto{" +
                "Nome: " + nome +
                ", Idade: " + idade +
                ", Nacionalidade: " + nacionalidade +
                ", Id: " + id +
                '}';
    }

}