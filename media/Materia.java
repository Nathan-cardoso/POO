/*Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
media : calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
provaFinal : calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final */
public class Materia {
    private int matricula;
    private String nome;
    private float notaProva1;
    private float notaProva2;
    private float notaTrabalho;
    private float media;

    public Materia(int matricula, String nome, float notaProva1, float notaProva2, float notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotaProva1(float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public void setNotaProva2(float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public float getMedia() {
        return media;
    }


    public float media(float notaProva1, float notaProva2, float notaTrabalho){
            this.media = (float) ((notaProva1*2.5) + (notaProva2*2.5) + (notaTrabalho*2))/7;
            return this.media;
    }


    public float provaFinal(){
        if(this.media >= 7.0f && this.media<= 10.0f){
            return 0.0f;
        }else{      
            return 10 - getMedia();
        }
    }

    public void mostrarMedia(){
        if(getMedia() >= 7){
            System.out.format("Parabens %s voce foi aprovado :)\nSua media: %.2f",getNome(), media(notaProva1, notaProva2, notaTrabalho));
        }else{
            System.out.format("%s voce vai para a prova final precisando de %.1f pontos\n",getNome(), provaFinal());
        }
    }


}
