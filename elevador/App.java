import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int capacidadeDePessoas, totalDeAndares;
        
        System.out.println("Informe a capacidade maxima de pessoas no elevador: ");
        capacidadeDePessoas = inp.nextInt();
        
        System.out.println("Informe o total de andares: ");
        totalDeAndares = inp.nextInt();
        
        Elevador elevador = new Elevador(totalDeAndares, capacidadeDePessoas);
        
        //Comandos para teste.
        elevador.situacaoDoElevador();
        elevador.desce();
        elevador.sai();

        for (int i = 0; i < totalDeAndares; i++) {
            elevador.sobe();
        }

        elevador.situacaoDoElevador();
        



        inp.close();
    }
}
