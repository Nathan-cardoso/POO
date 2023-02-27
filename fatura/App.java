import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Fatura fat;
        Random random = new Random(); //Crianção de um objeto para gerar um número aleatório.
        int id = 1 + random.nextInt(29); //Atribuindo a id um número aleatório no intervalo entre 1 à 30.
        int quantidade;
        float preco;
        String item, descricao;

        System.out.print("Digite o item que deseja comprar: ");
        item = inp.nextLine();

        System.out.print("Informe uma descricao do item desejado: ");
        descricao = inp.nextLine();

        System.out.print("Digite o valor do item: ");
        preco = inp.nextFloat();

        System.out.print("Digite a quantidade : ");
        quantidade = inp.nextInt();

         fat = new Fatura(id, preco, quantidade, item, descricao);
         fat.setPreco(preco);
         fat.calculaTotal(preco, quantidade);
         fat.mostrarFatura();

        inp.close();
    
    }
}
