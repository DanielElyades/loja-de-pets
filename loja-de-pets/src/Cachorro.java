public class Cachorro extends Animal {
    
    private String porte;

    public Cachorro(String nome, String especie, String raca, Integer idade, String porte) {
        super(nome, especie, raca, idade);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    public String brincar(){
        return "O Cachorro está brincando.";
    }
    
}
