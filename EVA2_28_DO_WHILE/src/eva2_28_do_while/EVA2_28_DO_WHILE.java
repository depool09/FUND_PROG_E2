/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_do_while;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_28_DO_WHILE {
  static final String USUARIO = "admin" ;
    static final String CONTRA = "admin";
   
    public static void main(String[] args) {
        // TODO code application logic here
    
  String usu, pdw;
  do{
     Scanner captu = new Scanner(System.in);
System.out.println("USUARIO");
 usu = captu.nextLine();
 System.out.println("USUARIO");
 pdw = captu.nextLine();

    }while((usu.equals(USUARIO)) || !(pdw.equals(CONTRA)));
    
    System.out.println("ACCESO CONCEDIDO!!");
}
    
}
