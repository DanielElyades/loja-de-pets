public class Gato extends Animal {
    
    private String pelagem;

    public Gato(String nome, String especie, String raca, Integer idade, String pelagem) {
        super(nome, especie, raca, idade);
        this.pelagem = pelagem;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
    public String miar(){
        return "Miau"
    }

}
