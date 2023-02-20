public class Run {
    public static void main(String[] args) {
        Data d1;
        d1 = new Data();
        d1.inicializaData(25, 12, 2020);
        if(d1.dataEhValida(25, 12, 2020) == false){
            System.out.println("Data invalida");
            d1.mostraData();
        }else{
            System.out.println("Data valida");
             d1.mostraData();
        }
    }
}
