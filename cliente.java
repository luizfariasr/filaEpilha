public class Cliente {
    private String identificador;  // ID do cliente
    private String nomeCompleto;   // Nome do cliente
    private String motivo;         // Motivo do atendimento

    public Cliente(String identificador, String nomeCompleto, String motivo) {
        this.identificador = identificador;
        this.nomeCompleto = nomeCompleto;
        this.motivo = motivo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getMotivo() {
        return motivo;
    }

    @Override
    public String toString() {
        return "Cliente ID: " + identificador + ", Nome: " + nomeCompleto + ", Motivo: " + motivo;
    }
}
