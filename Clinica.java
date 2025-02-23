import java.util.ArrayList;
public class Clinica {
    private String nomeClinica;
    private String endereco;
    private String telefone;
    private String email;
    private ArrayList<Pet> listaDePets;

    public Clinica(String nomeClinica, String endereco, String telefone, String email) {
        this.nomeClinica = nomeClinica;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.listaDePets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        this.listaDePets.add(pet);
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Pet> getListaDePets() {
        return listaDePets;
    }

    public void setNomeClinica(String novoNome) {
        this.nomeClinica = novoNome;
    }

    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }

    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }
}
