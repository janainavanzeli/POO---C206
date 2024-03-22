package PcMania;
public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] pc;
    cliente (){
        pc = new Computador[3]; // declaração do objeto
        // for para declaração de cada um dos campos do array pc[]
        for (int i = 0; i < pc.length; i++) {
            pc[i] = new Computador();
        }
    }
    public float calculaTotalCompra() {
        float total = 0; // Declaração da variavel que ira receber o valor total
        // For para realizar a soma de todos os produtos comprados
        for (int i = 0; i < pc.length; i++) {
            if (pc[i] != null) {
                total = total + pc[i].preco;
            }
        }
        return total;
    }
}
