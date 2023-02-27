/*Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
sobe : para subir um andar (não deve subir se já estiver no último andar);
desce : para descer um andar (não deve descer se já estiver no térreo). */
public class Elevador{
    private int andarAtual;
    private int totalDeAndares;
    private int pessoas;
    private int capacidade;

    public Elevador(int totalDeAndares, int capacidade) {
        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
        this.pessoas = 0;
        this.andarAtual = 0;
    }

    public void entra(){
        if(this.capacidade == this.pessoas){
            System.out.println("O elevador ja esta cheio");
        }else{
            this.pessoas++;
        }
    }

    public void sai(){
        if(this.pessoas == 0){
            System.out.println("O elevador esta vazio");
        }else{
            this.pessoas--;
        }
    }

    public void sobe(){
        if(this.totalDeAndares == this.andarAtual){
            System.out.println("Impossivel! o elevador esta no ultimo andar");
        }else{
            this.andarAtual++;
        }
    }

    public void desce(){
        if(this.andarAtual == 0){
            System.out.println("Impossivel! o elevador esta no terreo");
        }else{
            this.andarAtual--;
        }
    }

    public void situacaoDoElevador(){
        System.out.println("-------------");
        System.out.println("Tem " + this.pessoas + " pessoas de " + this.capacidade);
        System.out.println("Estamos no andar " + this.andarAtual + " De " + this.totalDeAndares);
    }
    


}