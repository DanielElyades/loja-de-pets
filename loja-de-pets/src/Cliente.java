public class Cliente {
    
    private String nome;
    private Integer telefone;
    private String endereco;
    
    public Cliente(String nome, Integer telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void comprarAnimal(Animal animal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprarAnimal'");
    }
    

    
}
