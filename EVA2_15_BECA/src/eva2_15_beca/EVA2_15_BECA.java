/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_15_BECA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
        Scanner captu = new Scanner(System.in);  
int promedio;
double salario;
 System.out.println("CuaL es tu promedio?");
 promedio = captu.nextInt();
 captu.nextLine();
 System.out.println("Cuanto gana mensualmente tu familia?");
 salario = captu.nextInt();
 
   if(promedio >= 80 && (salario < 10000)){
   System.out.println("Beca conceddia!!");
   }else{
   System.out.println("Beca rechazada");
   }
   }
    
}
