
package seriesnumeroespeciales;


public class Series {
    // mostrar los numero del 1 al 100
    // si el numero es multiplo de 3,remplazar al numero por UTN
    //si el numero es multiplo de 5 ,remplazazar por FRA
    //si el numero de 3 y 5 ,remplazamos el numero por UTN-FRA
    public static void MostrarDel1_al100(){
        for(int numero =1; numero <101; numero++){
            System.out.println("el numero es "+numero);
        }
        
    }
     public static void MostrarParesDel1_al100(){
        for(int numero =1; numero <101; numero++){
          if(Numeros.esPar(numero)==true){
          System.out.println("el numero es "+numero);
          }
        }
       }
     
     public static void MostrarSerieUTNFRA(){
          for(int numero =1; numero <101; numero++){
               if(numero%5==0){
                System.out.println("UTN");
                
              }else
                  System.out.println("el numero es"+numero);
               
                if(numero%3==0){
                System.out.println("FRA");
                
              }else
                  System.out.println(numero);
                
              if(numero%3==0 && numero%5==0){
                System.out.println("UTN-FRA");
                
              }else
                  System.out.println(numero);
          
        
     }
     }
     public static void MostrarNumeroPrimoDel_1al100(){
         for(int n=1; n<101; n++){
             if(Numeros.esPrimo(n)){
                 System.out.println("numeros primos :"+n);
             }
         }
     }
     public static void MostarNumerosPrimosEntreRangos(){
         // concluir 
        
         
     }
}
