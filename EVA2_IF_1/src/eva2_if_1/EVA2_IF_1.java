/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_if_1;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_IF_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner captu = new Scanner(System.in); 
    int edad;
    System.out.println("cual es tu edad");
    edad = captu.nextInt();
    //PARANTESIS OBLIGATORIOS, DENTRO DE LA EXPRESION CONDICIONAL (VERDADERO O FALSO)
    if(edad >= 18){//QUE HACEMOS SI ES VEDAD
    System.out.println("Bienvenido puedes entar!!");
    }else{ //QUE HACEMOS SI ES FALSO (FALSO)
        System.out.println("No puedes entar!!");
    }
    
    }
}
