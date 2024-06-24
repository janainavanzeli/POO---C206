import java.util.Date;

public class Solicitacao {
    private int idSolicitacoes;
    private Date datasolicitacao;
    private String tiposanguineo;
    private Estatus estatus;
    private int idReceptores;

    public enum Estatus {
        PENDENTE,
        ATENDIDA,
        CANCELADA
    }

    // Construtor
    public Solicitacao(int idSolicitacoes, Date datasolicitacao, String tiposanguineo, Estatus estatus, int idReceptores) {
        this.idSolicitacoes = idSolicitacoes;
        this.datasolicitacao = datasolicitacao;
        this.tiposanguineo = tiposanguineo;
        this.estatus = estatus;
        this.idReceptores = idReceptores;
    }

    // Getters e Setters
    public int getIdSolicitacoes() {
        return idSolicitacoes;
    }

    public void setIdSolicitacoes(int idSolicitacoes) {
        this.idSolicitacoes = idSolicitacoes;
    }

    public Date getDatasolicitacao() {
        return datasolicitacao;
    }

    public void setDatasolicitacao(Date datasolicitacao) {
        this.datasolicitacao = datasolicitacao;
    }

    public String getTiposanguineo() {
        return tiposanguineo;
    }

    public void setTiposanguineo(String tiposanguineo) {
        this.tiposanguineo = tiposanguineo;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public int getIdReceptores() {
        return idReceptores;
    }

    public void setIdReceptores(int idReceptores) {
        this.idReceptores = idReceptores;
    }

    @Override
    public String toString() {
        return "Solicitacao{" +
                "idSolicitacoes=" + idSolicitacoes +
                ", datasolicitacao=" + datasolicitacao +
                ", tiposanguineo='" + tiposanguineo + '\'' +
                ", estatus=" + estatus +
                ", idReceptores=" + idReceptores +
                '}';
    }
}
