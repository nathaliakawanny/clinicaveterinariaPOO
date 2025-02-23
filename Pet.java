public class Pet {
    private String nomePet;
    private String raca;
    private String sexo;
    private String peso;
    private String dataNascimento;
    private String cadastro; 

    public Pet(String nomePet, String raca, String sexo, String peso,
               String dataNascimento, String cadastro) {
        this.nomePet = nomePet;
        this.raca = raca;
        this.sexo = sexo;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.cadastro = cadastro;
    }

    public String getNomePet() {
        return nomePet;
    }

    public String getRaca() {
        return raca;
    }

    public String getSexo() {
        return sexo;
    }

    public String getPeso() {
        return peso;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pet other = (Pet) obj;
        return cadastro != null ? cadastro.equals(other.cadastro) : other.cadastro == null;
    }

    public String toString() {
        return "Pet [nomePet=" + nomePet + ", raca=" + raca + ", sexo=" + sexo +
               ", peso=" + peso + ", dataNascimento=" + dataNascimento + ", cadastro=" + cadastro + "]";
    }
}
