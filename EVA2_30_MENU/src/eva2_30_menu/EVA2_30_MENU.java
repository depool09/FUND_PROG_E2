/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_menu;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA2_30_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int opcion;
        Scanner captu = new Scanner(System.in);
    do{ 
        System.out.println("-----Menu-----");
        System.out.println("1. Ventas");
        System.out.println("2. Compras");
        System.out.println("3. Provedores");
        System.out.println("4. Clientes");
        System.out.println("5. Salir");
        
        opcion = captu.nextInt();
        captu.nextLine();
        
    }while(opcion !=5 ); //!=5 significa diferente de se seguira repitiendo el ciclo
    //LA CONDICION ES VERDADERA TERMINA CUANDO ES FALSA
     System.out.println("Saliendo del sistema");
    
    }
    
}
