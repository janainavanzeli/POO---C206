package Funcionalidade;
import Exceções.unchecked_semusuario;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Twitter twitter = new Twitter("110456Ha#",308);
        Facebook facebook = new Facebook("895677iu*",986);
        GooglePlus googlePlus = new GooglePlus("Fl53su85",78);
        Instagram instagram = new Instagram("1091oito@",10598);
        HashSet <RedeSocial> redesSociais = new HashSet<>();
        HashSet <RedeSocial> redesSociais2 = new HashSet<>();
        Usuario usuario = new Usuario(null,"janavanzeli@gmail.com",redesSociais);
        Usuario usuario2 = new Usuario("oi","janavanzeli@gmail.com",redesSociais2);

        redesSociais2.add(facebook);
        redesSociais.add(twitter);
        redesSociais.add(googlePlus);
        try {
            usuario.checar(usuario);
        }
        catch (unchecked_semusuario e) {
            System.err.println("Erro ao configurar o nome de usuário: " + e.getMessage());
        }
        try {
            usuario2.checar(usuario2);
        }
        catch (unchecked_semusuario e) {
            System.err.println("Erro ao configurar o nome de usuário: " + e.getMessage());
        }

        System.out.println();

        for(RedeSocial redeSocial : redesSociais){
            if(redeSocial instanceof GooglePlus){
                GooglePlus googleplus = (GooglePlus) redeSocial;
                googleplus.compartilhar();
                googleplus.fazStreaming();
                googleplus.postarFoto();
                googleplus.curtirPublicacao();
                System.out.println();
            }
            else{
                redeSocial.postarVideo();
                redeSocial.postarComentario();
                redeSocial.curtirPublicacao();
                System.out.println();
            }

        }
        System.out.println();

        for(RedeSocial redeSocial2 : redesSociais2){
            if(redeSocial2 instanceof Facebook){
                Facebook Facebook = (Facebook) redeSocial2;
                Facebook.compartilhar();
                Facebook.fazStreaming();
                Facebook.postarFoto();
                Facebook.curtirPublicacao();
                System.out.println();
            }
            else{
                redeSocial2.postarVideo();
                redeSocial2.postarComentario();
                redeSocial2.curtirPublicacao();
                System.out.println();
            }

        }
    }
}