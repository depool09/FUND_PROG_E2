/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_18_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        int dia;
        Scanner captu = new Scanner(System.in); 
        System.out.println("CuaL es el dia (1-7)?");
        dia = captu.nextInt();
        
        switch(dia){//EVALUA ENTEROS  IN, SHORT, BYE . TEXTO : STRIING ENUM
            case 1:
              System.out.println("Domingo");  
              //AQUI PODEMOS PPONER CUANTAS SITUACIONES SE NECESESITEN
              break;// AQUI SE TERMINA O SE DA ALTO AL SWITCH
            case 2:
                System.out.println("Lunes"); 
                break;
            case 3:
                System.out.println("Martes");  
              break;
            case 4:
                System.out.println("Miercoles"); 
                break;
            case 5:
                System.out.println("Jueves"); 
                break;
            case 6:
                System.out.println("Viernes"); 
                break;
            case 7:
                System.out.println("Sabado"); 
                break;
            default:    
                System.out.println("Dia no valido"); 
        }
            
    
    
    }
    
}
