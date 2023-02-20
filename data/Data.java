public class Data {
    int dia;
    int mes;
    int ano;

    void inicializaData(int d, int m, int a){
        dia = d;
        mes = m; 
        ano = a;
    }

    boolean dataEhValida(int d, int m, int a) {
        if(d < 0 || m < 1 || m > 12){
            return false;
        }
        else{
            return true;
        }
    }

    void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
