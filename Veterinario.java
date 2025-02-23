public class Veterinario extends Pessoa {
    private String especialidade;

    public Veterinario(String nome, String cpf, String dataNascimento, String rg,
                       String email, String telefone, String endereco, String especialidade) {
        super(nome, cpf, dataNascimento, rg, email, telefone, endereco);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public String toString() {
        return super.toString() + ", Veterinario [especialidade=" + especialidade + "]";
    }
}
