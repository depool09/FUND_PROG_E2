/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_bono;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_4_BONO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner captu = new Scanner(System.in);
   String nombre;
    int bono, salario, salfin;
    System.out.println("¿Cual es tu nombre?");
    nombre = captu.next();
    System.out.println("Hola " + nombre);
    System.out.println("¿Cual es tu salario?");
   salario = captu.nextInt();
   
   if(salario>=12000){
   bono = (salario * 10) / 100;
   salfin = salario - bono;
   System.out.println("Felicidades tienes un bono del 15 porciento");
    System.out.println("Tu bono es de " + bono);
    System.out.println("Tu salario final es de " + salfin);
   }else{
   bono = (salario * 5) / 100;
       salfin = salario - bono;
       System.out.println("Felicidades tienes un bono del 5 porciento");
    System.out.println("Tu bono es de " + bono);
    System.out.println("Tu salario final es de " + salfin);
   }
    }
    
}
