public class Cadastro {
    private String cpf;
    private double custo;
    private String dataCadastro;
    private String data;   
    private String pet;    

    public Cadastro(String cpf, double custo, String dataCadastro, String data, String pet) {
        this.cpf = cpf;
        this.custo = custo;
        this.dataCadastro = dataCadastro;
        this.data = data;
        this.pet = pet;
    }

    public String getCpf() {
        return cpf;
    }

    public double getCusto() {
        return custo;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public String getData() {
        return data;
    }

    public String getPet() {
        return pet;
    }

    public void setCpf(String novoCpf) {
        this.cpf = novoCpf;
    }

    public void setCusto(double novoCusto) {
        this.custo = novoCusto;
    }

    public void setDataCadastro(String novoDataCadastro) {
        this.dataCadastro = novoDataCadastro;
    }

    public void setData(String novaData) {
        this.data = novaData;
    }

    public void setPet(String novoPet) {
        this.pet = novoPet;
    }
}
