/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int horas;
        int hora;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuantas horas pasaste en el estacionamiento?");
    horas = captu.nextInt();
    if(horas <= 0){
        System.out.println("La cantidad no es valida");  
        }else if(horas < 0){
    hora = 25 * horas;     
    System.out.println("Exelente son " + hora);
    }else if(horas <= 5){
         hora = 20 * horas;
         System.out.println("Exelente son " + hora); 
    }else if(horas <= 10){
    hora = 15 * horas;
         System.out.println("Exelente son " + hora); 
    }else if(horas > 10){
        hora = 150;
    System.out.println("Exelente son " + hora);
   
    }
    }
    
}
