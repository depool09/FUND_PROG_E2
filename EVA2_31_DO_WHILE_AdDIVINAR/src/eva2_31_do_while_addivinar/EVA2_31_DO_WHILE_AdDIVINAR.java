/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_addivinar;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_31_DO_WHILE_AdDIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    int numero, numAdiv;
    Scanner captu = new Scanner(System.in);
    numAdiv = 64;
    do{
     System.out.println("Intenta advinar mi numero del 1-100");
     numero = captu.nextInt();
    
    }while(numero != numAdiv);
    System.out.println("ACERTASTE !!");
    }
    
}
