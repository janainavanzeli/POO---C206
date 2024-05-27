package Funcionalidade;
import Exceções.checked_duplicateemail;
import Exceções.unchecked_semusuario;
import java.util.HashSet;
import java.util.Set;



public class Usuario {
    private String nome;
    private String email;
    private Set<RedeSocial> redesSociais = new HashSet<>();

    private static Set<String> registeredEmails = new HashSet<>();

    public Usuario(String nome, String email, HashSet<RedeSocial> redesSociais) {
        try {
            if (registeredEmails.contains(email)) {
                throw new checked_duplicateemail("Email já registrado: " + email);
            }
            this.nome = nome;
            this.email = email;
            this.redesSociais = redesSociais;
            registeredEmails.add(email);
        }
        catch (checked_duplicateemail e) {
            System.err.println(e.getMessage());
        }
    }
    public void checar(Usuario usuario) throws unchecked_semusuario {
        if (usuario.nome == null || usuario.nome.isEmpty()) {
            throw new unchecked_semusuario("Nome de usuário não pode ser vazio.");
        }
        else{
            usuario.nome = nome;
            System.out.println("Nome de usuário configurado: " + nome);
        }

    }

}

