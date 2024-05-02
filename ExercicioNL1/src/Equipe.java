import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Piloto> pilotoList = new ArrayList<>();
    private Carro carro;
    private Piloto pilotoAtual;
    private String nome;

    private boolean trocarPilotoAtual(int pilotoId ){
        if(pilotoId >0 && pilotoId <= pilotoList.size()){
            pilotoAtual = pilotoList.get(pilotoId);
            System.out.println("Pilotos foram trocados!");
            return true;
        }
        else{
            System.out.println("Troca invalida!");
            return false;
        }

    }
    private boolean trocarPneu(int tipoDePneu){
        if(tipoDePneu>=1 && tipoDePneu <=5 ){
            System.out.println("Seu pneu era "+carro.getTipoDePneu());
            carro.setTipoDePneu(tipoDePneu);
            System.out.println("Seu pneu agora é " + carro.getTipoDePneu());
            return true;
        }
        else{
            return false;
        }

    }
    public void pitStop(int tipoDePneu, int pilotoId){
        if(trocarPneu(tipoDePneu)){
            System.out.println("Troca de pneus deu certo");
        }
        else{
            System.out.println("Houve um problema na troca de pneus.");
        }
        if(trocarPilotoAtual(pilotoId)){
            System.out.println("Troca realizada com sucesso!");
        }
        else{
            System.out.println("O piloto vai correr mais um pouco.");
        }

    }
    public void adicionarPiloto(Piloto piloto){
        if(pilotoList.size() < 4){
            pilotoList.add(piloto);
            System.out.println("Piloto " + piloto.getNome() + " adicionado a equipe");

        }
        else{
            System.out.println("Limite máximo de pilotos atingido");

        }
    }
    public boolean retirarPiloto(int pilotoId){
        if(pilotoId > 0 && pilotoId <= pilotoList.size()){
            pilotoList.remove(pilotoId -1);
            System.out.println("Piloto removido.");
            return  true;
        }
        else{
            System.out.println("Piloto não encontrado!");
            return false;
        }
    }
    public Equipe(String nome){
        this.nome = nome;
    }
    public void constroiCarro(int tipoDePneu, int potencia, boolean turbo) {
        carro = new Carro(tipoDePneu, potencia, turbo);
    }


    public List<Piloto> getPilotoList() {
        return pilotoList;
    }

    public void setPilotoList(List<Piloto> pilotoList) {
        this.pilotoList = pilotoList;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Piloto getPilotoAtual() {
        return pilotoAtual;
    }

    public void setPilotoAtual(Piloto pilotoAtual) {
        this.pilotoAtual = pilotoAtual;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Equipe{" +
                "Lista de pilotos: " + pilotoList +
                ", Carro: " + carro +
                ", Piloto Atual: " + pilotoAtual +
                ", Nome: " + nome +
                '}';
    }
}