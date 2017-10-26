
package repasooctubre_26_2017;
/**
 * 
 * @author parametros deben hardcodear los numero
 */

public class Calculadora_26 {
   
    public int PrimerNumero;
    public int SegundoNumero;
    Calculadora_26(){
        this.PrimerNumero=10;
        this.SegundoNumero=10;
    }
    public static void Sumar(int numeroUno, int numeroDos)
    {
        int suma = numeroUno +numeroDos;
        System.out.println("la suma es "+suma);
    }
   
    // de instancia o de objeto
    public  void Sumar(){
        int suma = this.PrimerNumero+this.SegundoNumero;
        System.out.println("la suma es "+suma);
        
    }
    public void dividir(){
        float resultado=0;
    }
   
    
    //restorna true si el segundo numero es distinto de cero
    private boolean SePuedeDividir(){
        boolean retorno=false;
        if(this.SegundoNumero!=0){
            retorno=true;
        }
            return retorno;
    }
  
    
   
}