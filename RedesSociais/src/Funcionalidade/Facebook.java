package Funcionalidade;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Gravou video no Facebook!");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Facebook!");

    }

    @Override
    public void compartilhar(){
        System.out.println("Compartilhar no Facebook!");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu sua publicação no Facebook!");
    }

    @Override
    public void fazStreaming(){
        System.out.println("Fazendo live no Facebook!");
    }


}