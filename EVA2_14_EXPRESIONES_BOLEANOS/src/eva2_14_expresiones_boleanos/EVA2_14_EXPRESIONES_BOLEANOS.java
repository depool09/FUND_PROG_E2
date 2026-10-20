/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_boleanos;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_14_EXPRESIONES_BOLEANOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //beca
        //promedio >= 95
        //esta en el equipo represantitvo
  Scanner captu = new Scanner(System.in);  
int promedio;
String representativo;
 System.out.println("CuaL es tu promedio?");
 promedio = captu.nextInt();
 captu.nextLine();
 System.out.println("Estas en el equipo representativo (S/N?)");
 representativo = captu.nextLine();
 
 if(promedio >= 95 || representativo.equals("S")){
  System.out.println("Beca concedida!!");
 }else{
  System.out.println("Beca denegada!!");
 }



    }
    }

