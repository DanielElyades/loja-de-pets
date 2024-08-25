public class Animal {

    private String nome;
    private String especie;
    private String raca;
    private Integer idade;
    
    public Animal(String nome, String especie, String raca, Integer idade) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String emitirSom(){
        return "O animal está emitindo som.";
    }
    public String comer(){
        return "O animal está comendo.";
    }

    
}