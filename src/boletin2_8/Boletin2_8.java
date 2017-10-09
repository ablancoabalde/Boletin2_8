
package boletin2_8;

import java.util.Scanner;

public class Boletin2_8 {

    public static void main(String[] args) {
     
        int billetes100, billetes20, billetes5, monedas=1;
        
        Scanner entradateclado= new Scanner (System.in);
        
        System.out.println("Cuantos billes de 100 euros ha ingresado"); 
        
        billetes100= entradateclado.nextInt();
        
        System.out.println("Cuantos billes de 20 euros ha ingresado"); 
        
        billetes20=entradateclado.nextInt();
        
        System.out.println("Cuantos billes de 5 euros ha ingresado"); 
        
        billetes5=entradateclado.nextInt();
        
        System.out.println("Cuantos monedas de 1 euro ha ingresado"); 
        
        monedas=entradateclado.nextInt();
        
        System.out.println("usted a ingresado " + (100*billetes100 + 20*billetes20 + 5*billetes5 + 1*monedas) + " euros");
        
    }
    
}
