public class Solicitacao {
    private String codigoSolicitacao;  // Código da solicitação
    private String detalhes;           // Descrição da solicitação
    private String dataHora;           // Data e hora da solicitação

    public Solicitacao(String codigoSolicitacao, String detalhes, String dataHora) {
        this.codigoSolicitacao = codigoSolicitacao;
        this.detalhes = detalhes;
        this.dataHora = dataHora;
    }

    public String getCodigoSolicitacao() {
        return codigoSolicitacao;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public String getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "Código: " + codigoSolicitacao + ", Detalhes: " + detalhes + ", Data/Hora: " + dataHora;
    }
}
