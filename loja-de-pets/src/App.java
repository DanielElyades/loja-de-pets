import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        boolean condicao = true;
        Loja loja = new Loja();
        while (condicao) {
            System.out.println("1. Adicionar animal");
            System.out.println("2. Adicionar cliente");
            System.out.println("3. Vender animal");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            if(opcao == 1){
                System.out.println("Informe o nome do animal");
                Animal animal = scanner.next;
                loja.adicionarAnimal(animal);


            }
            if(opcao == 2){

            }
            if(opcao == 3){

            }
            if (opcao == 4) {
                condicao = false;
            }
            System.out.println("Saiu do loop.");
        }

    }
}
