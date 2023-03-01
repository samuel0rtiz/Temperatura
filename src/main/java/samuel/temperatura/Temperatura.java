/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package samuel.temperatura;

/**
 *
 * @author samuelortiz
 */
public class Temperatura {
    final double PUNTO_CONGELACION = 32.0;
        final double FACTOR_CONVERSION = 5.0 / 9.0;
        double fahrenheit = 50; // temperatura en Fahrenheit
        double celsius; // temperatura en Celsius

 public  void  calculo() {
        

        celsius = FACTOR_CONVERSION * (fahrenheit - PUNTO_CONGELACION);
        System.out.println(fahrenheit + " grados Fahrenheit = "
                + celsius + " grados Celsius.");
        
       
    }
    
      public static void  main (String[]args){
            Temperatura nuevocalculo=new Temperatura();
            nuevocalculo.calculo ();        
        
    }
    
}
