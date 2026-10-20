/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
         double val1, val2, resultado;
         String operacion; 
        Scanner captu = new Scanner(System.in); 
        System.out.println("Escribe el primer valor");
        val1 = captu.nextInt();
         System.out.println("Escribe el segundo valor");
        val2 = captu.nextInt();
        captu.nextLine();
        System.out.println("Que operacion quieres hacer (Suma, Resta, Multiplicacion, Division)?");
        operacion = captu.nextLine();
        
        switch(operacion){
        
            case"Suma": 
        resultado = val1 + val2;
        System.out.println("El resultado " + resultado);
        break;
             case"Resta": 
        resultado = val1 - val2;
        System.out.println("El resultado " + resultado);
         break;
            case"Multiplicacion": 
        resultado = val1 * val2;
        System.out.println("El resultado " + resultado);
         break;
            case"Division": 
        resultado = val1 / val2;
        System.out.println("El resultado " + resultado);
         break;
            default:
                System.out.println("La operacion no es valida");
        }
    }
    
}
