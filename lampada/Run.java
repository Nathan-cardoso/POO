package lampada;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Lampada lampada = new Lampada();
        lampada.mostrarEstado();
        lampada.mostrarContador();




        inp.close();
    }
}
