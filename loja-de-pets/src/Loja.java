import java.util.ArrayList;

public class Loja {
    ArrayList<Animal>animais = new ArrayList<>();
    ArrayList<Cliente>clientes = new ArrayList<>();

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void comprarAnimal(Animal animal, Cliente cliente){
        if (animais.contains(animal)) {
            animais.remove(animal);
            cliente.comprarAnimal(animal);
            System.out.println("Venda realizada com sucesso.");
        }
        else{
            System.out.println("Animal não encontrado no estoque.");
        }
    }
}
