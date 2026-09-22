/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_calificacion_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_CALIFICACION_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner captu = new Scanner(System.in); 
    int calif;
    System.out.println("cuanto sacaste de promedio?");
    calif = captu.nextInt();
    if(calif >= 70){
    System.out.println("Felicidades acreditaste la materia!!");
    }else{ 
        System.out.println("Tendras que presentar la segunda oportunidad");
    }
    
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
