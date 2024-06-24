import java.util.Date;

public class Receptor {
    private int idReceptor;
    private String nome;
    private String sexo;
    private Date datanascimento;
    private String tiposanguineo;
    private String email;
    private String telefone;
    private String endereco;
    private String hospital;
    private String medicoresponsavel;
    private String diagnostico;

    // Construtor
    public Receptor(int idReceptor, String nome, String sexo, Date datanascimento, String tiposanguineo,
                    String email, String telefone, String endereco, String hospital, String medicoresponsavel,
                    String diagnostico) {
        this.idReceptor = idReceptor;
        this.nome = nome;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
        this.tiposanguineo = tiposanguineo;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.hospital = hospital;
        this.medicoresponsavel = medicoresponsavel;
        this.diagnostico = diagnostico;
    }

    // Getters e Setters
    public int getIdReceptor() {
        return idReceptor;
    }

    public void setIdReceptor(int idReceptor) {
        this.idReceptor = idReceptor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
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

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getMedicoresponsavel() {
        return medicoresponsavel;
    }

    public void setMedicoresponsavel(String medicoresponsavel) {
        this.medicoresponsavel = medicoresponsavel;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Receptor{" +
                "idReceptor=" + idReceptor +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", datanascimento=" + datanascimento +
                ", tiposanguineo='" + tiposanguineo + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", hospital='" + hospital + '\'' +
                ", medicoresponsavel='" + medicoresponsavel + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                '}';
    }
}
