package time;
public class Time{
    private String nome;
    private int vitoria;
    private int derrota;
    private int empate;

    Time(String nome, int vitoria, int derrota, int empate){
        this.nome = nome;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
   }

   public int potuacao(int vitoria, int empate){
        vitoria *= 3;
        return vitoria + empate;
   }

   public int partidas(int vitoria, int derrota, int empate){
   return vitoria + derrota + empate;
   }

   public void mostrarDados(){
    System.out.println("Total de pontos: " + potuacao(vitoria, empate));
    System.out.println("O numero de partidadas do " + nome + ": " + partidas(vitoria, derrota, empate));
   }

}