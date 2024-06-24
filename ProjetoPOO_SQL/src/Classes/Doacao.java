import java.util.Date;

public class Doacao {
    private int idDoacoes;
    private Date datadoacao;
    private String tiposanguineo;
    private String pressaoarterial;
    private double pesodoador;
    private int idDoador;
    private int idSolicitacao;

    // Construtor
    public Doacao(int idDoacoes, Date datadoacao, String tiposanguineo, String pressaoarterial, double pesodoador, int idDoador, int idSolicitacao) {
        this.idDoacoes = idDoacoes;
        this.datadoacao = datadoacao;
        this.tiposanguineo = tiposanguineo;
        this.pressaoarterial = pressaoarterial;
        this.pesodoador = pesodoador;
        this.idDoador = idDoador;
        this.idSolicitacao = idSolicitacao;
    }

    // Getters e Setters
    public int getIdDoacoes() {
        return idDoacoes;
    }

    public void setIdDoacoes(int idDoacoes) {
        this.idDoacoes = idDoacoes;
    }

    public Date getDatadoacao() {
        return datadoacao;
    }

    public void setDatadoacao(Date datadoacao) {
        this.datadoacao = datadoacao;
    }

    public String getTiposanguineo() {
        return tiposanguineo;
    }

    public void setTiposanguineo(String tiposanguineo) {
        this.tiposanguineo = tiposanguineo;
    }

    public String getPressaoarterial() {
        return pressaoarterial;
    }

    public void setPressaoarterial(String pressaoarterial) {
        this.pressaoarterial = pressaoarterial;
    }

    public double getPesodoador() {
        return pesodoador;
    }

    public void setPesodoador(double pesodoador) {
        this.pesodoador = pesodoador;
    }

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }

    public int getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(int idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    @Override
    public String toString() {
        return "Doacao{" +
                "idDoacoes=" + idDoacoes +
                ", datadoacao=" + datadoacao +
                ", tiposanguineo='" + tiposanguineo + '\'' +
                ", pressaoarterial='" + pressaoarterial + '\'' +
                ", pesodoador=" + pesodoador +
                ", idDoador=" + idDoador +
                ", idSolicitacao=" + idSolicitacao +
                '}';
    }
}
