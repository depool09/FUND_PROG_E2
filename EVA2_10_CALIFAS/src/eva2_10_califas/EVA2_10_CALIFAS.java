/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_10_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner captu = new Scanner(System.in);
     int promedio;
     System.out.println("Cuanto fue tu promedio?");
     promedio = captu.nextInt();
     if(promedio > 100){
     System.out.println("No digas mentiras");
     }else if(promedio >= 90){
      System.out.println("Sobresaliente!!");
     }else if(promedio >= 80){
      System.out.println("Buena calificacion");
     }else if(promedio >= 70){
      System.out.println("Calificacion decente");
      }else if(promedio >= 0){
      System.out.println("Reprobaste");
      }else{
   
      }}
}
