package lampada;

public class Contador {
    private static int numero;

    

    public Contador(int numero) {
        Contador.numero = numero;
    }

    public void zerar(){
        numero = 0;
    }

    public void incrementar(){
        numero++;
    }

    public int incrementar(int numero){
        return Contador.numero++;
    }

    public void imprimir(){
        System.out.println(numero);
    }
}
