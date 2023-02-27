import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Materia aluno;
        
        float nota1, nota2, nota3;
        int matricula;
        String nomeAluno;
        Scanner inp = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nomeAluno = inp.nextLine();

        System.out.println("Digite o numero da sua matricula: ");
        matricula = inp.nextInt();

        System.out.println("Informe a nota da primeira prova: ");
        nota1 = inp.nextFloat();

        System.out.println("Informe a nota da segunda prova: ");
        nota2 = inp.nextFloat();

        System.out.println("Informe a nota do trabalho: ");
        nota3 = inp.nextFloat();

        aluno = new Materia(matricula, nomeAluno, nota1, nota2, nota3);

        aluno.media(nota1, nota2, nota3);

        aluno.mostrarMedia();

        inp.close();

        
    }
}
