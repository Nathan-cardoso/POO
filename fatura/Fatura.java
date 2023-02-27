public class Fatura {
    private int id;
    private float preco;
    private int quantidade;
    private String item;
    private String descricao;


    Fatura(int id, float preco,int quantidade, String item, String descricao) {
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
        this.item = item;
        this.descricao = descricao;
    }


    public int getId() {
        return id;
    }


    public float getPreco() {
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }


    public String getItem() {
        return item;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setPreco(float preco) {
        if(this.preco > 0 ){
            this.preco = preco;
        }else{
            this.preco = 0.0f;
        }
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }


    public void setItem(String item) {
        this.item = item;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float calculaTotal(float preco, int quantidade){
        return (float)preco * quantidade;
    }

    public void mostrarFatura(){
        if(calculaTotal(preco, quantidade) > 0){
            System.out.println("\tCompra realizada!\n");
            System.out.format("O valor total do(a) %s é %.2f R$\n\n",getItem(), calculaTotal(preco, quantidade));
        }else{
            System.out.println("\tCompra invalida!\nPor favor, verifique os dados se estão corretos");
        }
    }
    

}
