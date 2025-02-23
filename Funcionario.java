public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cpf, String dataNascimento, String rg,
                       String email, String telefone, String endereco, String cargo) {
        super(nome, cpf, dataNascimento, rg, email, telefone, endereco);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String toString() {
        return super.toString() + ", Funcionario [cargo=" + cargo + "]";
    }
}
