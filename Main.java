public class Main {
    public static void main(String[] args) {
        Responsavel resp1 = new Responsavel("João Silva", "11122233344",
        "01/01/1980", "1234567", "joao@exemplo.com", 
        "1111-2222", "Rua A, 123");
        System.out.println("Responsavel inicial: " + resp1);
        
        resp1.setCpf("22233344455");
        resp1.setNome("João da Silva");
        resp1.setEndereco("Rua B, 456");
        System.out.println("Responsavel após alterações: " + resp1);
        
        Responsavel respCopia = new Responsavel("João da Silva", "22233344455",
        "01/01/1980", "1234567", "joao@exemplo.com", "1111-2222", 
        "Rua B, 456");
        System.out.println("Equals Responsavel: " + resp1.equals(respCopia));
        
        
        Veterinario vet1 = new Veterinario("Dra. Maria", "55566677788", 
        "05/05/1975", "7654321", "maria@exemplo.com", "3333-4444", 
        "Rua das Flores, 789","Clínico Geral");
        System.out.println("\nVeterinario inicial: " + vet1);
        
        vet1.setCpf("66677788899");
        vet1.setNome("Dr. Maria Souza");
        vet1.setEspecialidade("Cirurgiã");
        System.out.println("Veterinario após alterações: " + vet1);
        
        
        Pet pet1 = new Pet("Rex", "Labrador", "Macho", "30kg", 
        "10/10/2019", "Cadastro001");
        System.out.println("\nPet inicial: " + pet1);
        pet1.setNomePet("Max");
        System.out.println("Pet após alteração: " + pet1);
        
        
        Clinica clinica = new Clinica("Patas & Focinhos", "Av. Central, 100", 
        "9999-8888", "contato@patasfocinhos.com");
        clinica.addPet(pet1);
        System.out.println("\nClinica: " + clinica.getNomeClinica());
        System.out.println("Pets cadastrados na Clinica: ");
        for (Pet pet : clinica.getListaDePets()) {
            System.out.println("  - " + pet);
        }
        System.out.println("\nTestes concluídos.");
    }
}
