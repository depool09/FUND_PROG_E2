/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_ahorro;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_34_AHORRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner captu = new Scanner(System.in);
    int ahorro = 15000;
    int deposito;
    int cuenta = 0;
    
    while(true){ //ciclo infinito
    
     System.out.print(" Introduce monto de deposito ");
     deposito = captu.nextInt();
     captu.nextLine();
     
     if((cuenta + deposito) > 15000){
     
     System.out.print("te pasaste de la meta");
     continue;}
    
    cuenta += deposito;
    System.out.print("Cuenta = " + cuenta);
    if(cuenta == ahorro){
    System.out.print(" se ah llegado ala meta!!");
    break; //detiene el ciclo por ocmpleto
    }
    }
    
}
}