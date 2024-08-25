public class Passaro extends Animal {
    
    private String cor;

    public Passaro(String nome, String especie, String raca, Integer idade, String cor) {
        super(nome, especie, raca, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String voar(){
        return "O pássaro está voando.";
    }
}
