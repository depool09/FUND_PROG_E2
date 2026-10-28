/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_break;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_33_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int valor = 10;
    Scanner captu = new Scanner(System.in);
    int num;
    while(true){ //ciclo infinito
    
     System.out.print(" introduce un valor ");
     num = captu.nextInt();
     captu.nextLine();
     
     if(num == valor){
     
     System.out.print(" ADIVINASTE, EL VALOR ES 10, GANASTE!! ");
     break;
     }
    
    }
    }
    
}
