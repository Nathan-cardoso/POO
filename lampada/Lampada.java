/*Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado) e os métodos acende, apaga e mostraEstado (ex.: “A lampada esta acesa”). Inclua um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para isso, utilize uma instância da classe Contador criada na questão anterior e implemente a lógica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre as capacidades da classe criada.
 */

package lampada;

public class Lampada {
    private boolean estadoDaLampada;
    private int quantidadeAcesa;
    Contador contLampada = new Contador(this.quantidadeAcesa);
    public void acende(){
        this.estadoDaLampada = true;
        contLampada.incrementar(quantidadeAcesa);
    }

    public void apaga(){
        this.estadoDaLampada = false;
    }

    public void mostrarEstado(){
        if(estadoDaLampada == false)
        System.out.println("A lampada esta apagada");
        else
        System.out.println("A lampada esta acesa");
    }

    public void mostrarContador(){
        System.out.println(contLampada.incrementar(quantidadeAcesa));
    }

}
