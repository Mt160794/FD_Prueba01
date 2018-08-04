/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;

/**
 *
 * @author Administrador
 */
public class Clase01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
     String[] nombres = {"Luis","Jose","Maria","Pedro"} ;  
     
             for (int i = 0; i < nombres.length; i++){
                 String mensaje = Saluda(nombres[i]);
                 System.out.println(mensaje);
    
        }
             
             
    }
    //FUNCION
    static String Saluda(String nombre){
        String saludo = "Hola "+ nombre + " que tal";
        return saludo;
    }
    
    //metodo
    void SaludaVerisonMetodo(){
        System.out.println("Hola, como estas (Metodo)");
        
    }
    
}



