/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_descuento;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_3_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner captu = new Scanner(System.in);
    int producto, canti, total, descuento;
    System.out.println("¿Cuanto cuesta tu producto?");
    producto = captu.nextInt();
    System.out.println("¿Cuantos tomaste?");
    canti = captu.nextInt();
    total = producto * canti;
         if(total>=1000){
            descuento = (total * 10) / 100;
        System.out.println("Se ah aplicado un descuento del 10 porciento!!");
        total = total - descuento;
        
        System.out.println("El Descuento fue = " + descuento);
        System.out.println("Tu Subtotal = " + total);
        
         }else{
         System.out.println("Tu Subtotal = " + total);
         }
    
    
    
    
    }
    
}
