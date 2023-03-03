import java.util.Calendar;

public class EntradaEmAgenda{
    Calendar c = Calendar.getInstance();
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;



    public EntradaEmAgenda(int dia, int mes, int ano) {

        if(dia < 1 || dia > 31){
            System.out.println("Dia invalido");
        }else{
            this.dia = dia;
        }

        if(mes < 1 || mes > 12 ){
            System.out.println("Mes invalido");
        }else{
            this.mes = mes;
        }

        if(ano > c.get(Calendar.YEAR) ){
            System.out.println("Ano invalido");
        }else{
            this.ano = ano;
        }   
    }


    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        if(hora < 1 || hora > 24){
            System.out.println("Hora invalido");
        }else{
            this.hora = hora;
        }

        if(dia < 1 || dia > 31){
            System.out.println("Dia invalido");
        }else{
            this.dia = dia;
        }

        if(mes < 1 || mes > 12 ){
            System.out.println("Mes invalido");
        }else{
            this.mes = mes;
        }

        if(ano > c.get(Calendar.YEAR) ){
            System.out.println("Ano invalido");
        }else{
            this.ano = ano;
        }
        
        this.assunto = assunto;
    }


    public boolean ehDoDia(int dia, int mes, int ano){

        if(dia == this.dia && mes == this.mes && ano == this.ano ){
            return true;
        }else{
            return false;
        }
         
    }

    public String toString(){
        return "Dia: " + this.dia + "\nMes: " + this.mes + "\nAno: " + this.ano;
    }

    
}
