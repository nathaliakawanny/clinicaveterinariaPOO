public class Responsavel extends Pessoa {

    public Responsavel(String nome, String cpf, String dataNascimento, String rg,
                       String email, String telefone, String endereco) {
        super(nome, cpf, dataNascimento, rg, email, telefone, endereco);
    }

    public String toString() {
        return "Responsavel: " + super.toString();
    }
}
