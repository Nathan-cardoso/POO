package time;
import java.util.Scanner;

public class ExeTime {
    public static void main(String[] args) {
        Time time1;
        String nomeTime;
        int vitoriaDoTime, derrotaDoTime, empateDoTime;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o nome do time para saber informacoes  : ");
        nomeTime = input.nextLine();
      
        System.out.print("Digite o numero de vitorias: ");
        vitoriaDoTime = input.nextInt();

        System.out.print("Digite o numero de derrotas: ");
        derrotaDoTime = input.nextInt();

        System.out.print("Digite o total de empates: ");
        empateDoTime = input.nextInt();

        time1 = new Time(nomeTime, vitoriaDoTime, derrotaDoTime, empateDoTime);

        time1.mostrarDados();

        input.close();
    }

}
