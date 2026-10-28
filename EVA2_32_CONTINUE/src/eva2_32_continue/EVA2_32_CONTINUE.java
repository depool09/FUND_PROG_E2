/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_continue;

import java.awt.BorderLayout;

/**
 *
 * @author leo11
 */
public class EVA2_32_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    //continue --> interrumpe la interaccion actual
    
    for(int i = 0; i <=20; i++){
      
    int residuo = i % 2;
   if(residuo == 0){
   System.out.print(i + " - ");
   continue; // INTERRUMPE LA INTERRACIUN ACTUAL 
   }
   
  // System.out.print(" NUMERO PAR ");
    }
    }
    
}
