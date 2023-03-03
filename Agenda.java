public class Agenda {

    public static void listaDia(EntradaEmAgenda[] e, int dia, int mes, int ano){
       for(int i = 0; i < e.length; i++){
        if(e[i].ehDoDia(dia, mes, ano) == true){
            e[i].toString();
        }
       }
        
    }



}
