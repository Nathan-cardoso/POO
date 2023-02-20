public class Pessoa {
    private String nome;
    private float altura;

    public Pessoa(String nome, float altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    public String toString() {
        return "Pessoa [nome=" + nome + ", altura=" + altura + "]";
    }

    

    

}
