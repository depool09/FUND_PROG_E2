/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23capturar;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_23CAPTURAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    int cant, califa;
    double promedio;
    califa = 0;
     Scanner captu = new Scanner(System.in);
      System.out.println("Cuantas calificaciones vas a capturar?");
      cant = captu.nextInt();
      captu.nextLine();
      
      for(int i = 0; i <= cant; i++){
          System.out.println("Captura la calificacion");
          califa = califa + captu.nextInt(); //ACUMULADOR
          captu.nextLine();
          
          System.out.println("Captura la calificacion" + califa);
          promedio = califa / (cant * 1.0);
          System.out.println("El promedio de las calificaciones es " + promedio);
          
    }
      
      
      
    }
    
}
