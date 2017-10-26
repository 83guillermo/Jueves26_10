
package seriesnumeroespeciales;


public class Numeros {
    public static boolean esPar(int numero){
        boolean retorno = false;
        // el if sin llaves ejecuta solo la siguiente linea
        if(numero%2==0)
            return true;
        
        return false;
    }
    public static boolean esPrimo(int numero){
        int contadordeDivisores=0;
        for(int contador=numero-1; contador >1; contador--){
            if(numero%contador==0)
            {
                contadordeDivisores++;
                break;
            }
        }
        if(contadordeDivisores==0)
        return true;
       return false;
     
    }
    public static void rangos(int numeroInicial,int numeroFinal){
        //concluir
    }
            
}
