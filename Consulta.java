public class Consulta {
    private String data;
    private String time;        
    private String diagnostico;
    private String tratamento;

    public Consulta(String data, String time, String diagnostico, String tratamento) {
        this.data = data;
        this.time = time;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
    }

    public String getData() {
        return data;
    }

    public String getTime() {
        return time;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setData(String novaData) {
        this.data = novaData;
    }

    public void setTime(String novoTime) {
        this.time = novoTime;
    }

    public void setDiagnostico(String novoDiagnostico) {
        this.diagnostico = novoDiagnostico;
    }

    public void setTratamento(String novoTratamento) {
        this.tratamento = novoTratamento;
    }
}
