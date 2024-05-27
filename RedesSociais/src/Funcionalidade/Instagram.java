package Funcionalidade;

public class Instagram extends RedeSocial{
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Instagram!");

    }

    @Override
    public void postarComentario() {
        System.out.println("Fez um comentario no Instagram!");

    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu sua foto no Instagram!");
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello Instagram!");
        }
    }
}
