/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expresiones_boleanas;

/**
 *
 * @author leo11
 */
public class EVA2_13_EXPRESIONES_BOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    boolean entrarAntro, tieneCredencial = false;
    int edad = 25;
    //AND para que sea verdad, ambas expresiones deben ser verdaderas (true)
    entrarAntro = (edad >= 18) && (tieneCredencial == true);
    System.out.println(entrarAntro);
    
    //or --> Conque una de las expresioenes sea verdaderas (cualquiera) debe ser verdad
     boolean pedirPermiso;
     boolean tienesDinero = false, estaSoleasdo = false;
     pedirPermiso = (estaSoleado == true) || (tienesDinero == true)
     System.out.println(pedirPermiso);        
             
     
    //and-->&&
    //or-->||
    //not -->!
    
    
    
    }
    
}
