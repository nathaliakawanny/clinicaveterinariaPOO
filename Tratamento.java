public class Tratamento extends Consulta {
    private String descricao;
    private String remedios;
    private String exames;

    public Tratamento(String data, String time, String diagnostico, String tratamento,
                      String descricao, String remedios, String exames) {
        super(data, time, diagnostico, tratamento);
        this.descricao = descricao;
        this.remedios = remedios;
        this.exames = exames;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getRemedios() {
        return remedios;
    }

    public String getExames() {
        return exames;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setRemedios(String remedios) {
        this.remedios = remedios;
    }

    public void setExames(String exames) {
        this.exames = exames;
    }
}

