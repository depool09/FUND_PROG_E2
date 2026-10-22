/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_24_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    int fact, cant;
    fact = 1;
     Scanner captu = new Scanner(System.in);
      System.out.println("Factorial de?");
      cant = captu.nextInt();
      captu.nextLine();
      for(int i = 1; i <= cant; i++){
      System.out.println(i);
      fact = fact * i;
      System.out.println("Factorial de " + cant + " = " + fact);
    }
    }
}
