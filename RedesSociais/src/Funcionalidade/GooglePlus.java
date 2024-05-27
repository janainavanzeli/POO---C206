package Funcionalidade;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Google Plus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando video no Google Plus!");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentario no Google Plus!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu sua publicação no Google Plus!");
    }

    @Override
    public void compartilhar(){
        System.out.println("Compartilhando midia no Google Plus!");
    }
    @Override
    public void fazStreaming(){
        System.out.println("Live aqui hoje as 15h!");
    }
}