import java.util.Date;

public class Doador {
    private int idDoador;
    private String nome;
    private Sexo sexo;
    private Date datanascimento;
    private String tiposanguineo;
    private String email;
    private String telefone;
    private String endereco;
    private double peso;
    private Date ultimadoacao;
    private String historicomedico;

    public enum Sexo {
        MASCULINO,
        FEMININO,
        OUTRO
    }

    // Construtor
    public Doador(int idDoador, String nome, Sexo sexo, Date datanascimento, String tiposanguineo,
                  String email, String telefone, String endereco, double peso, Date ultimadoacao,
                  String historicomedico) {
        this.idDoador = idDoador;
        this.nome = nome;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
        this.tiposanguineo = tiposanguineo;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.peso = peso;
        this.ultimadoacao = ultimadoacao;
        this.historicomedico = historicomedico;
    }

    // Getters e Setters
    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getTiposanguineo() {
        return tiposanguineo;
    }

    public void setTiposanguineo(String tiposanguineo) {
        this.tiposanguineo = tiposanguineo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getUltimadoacao() {
        return ultimadoacao;
    }

    public void setUltimadoacao(Date ultimadoacao) {
        this.ultimadoacao = ultimadoacao;
    }

    public String getHistoricomedico() {
        return historicomedico;
    }

    public void setHistoricomedico(String historicomedico) {
        this.historicomedico = historicomedico;
    }

    @Override
    public String toString() {
        return "Doador{" +
                "idDoador=" + idDoador +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", datanascimento=" + datanascimento +
                ", tiposanguineo='" + tiposanguineo + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", peso=" + peso +
                ", ultimadoacao=" + ultimadoacao +
                ", historicomedico='" + historicomedico + '\'' +
                '}';
    }
}
