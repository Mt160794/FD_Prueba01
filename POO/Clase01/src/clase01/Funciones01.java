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
public class Funciones01 {
    public static void main(String[] args) {
        
        String saludo = "";
        double promedio = 0;
        String mensaje = "";
        
        //Alumno1
        saludo = SaludarAlumno("Luis");
        promedio = CalcularPromedio(11,12,20);
        mensaje = MensajeFinal(promedio);
        System.out.println(saludo);
        System.out.println(mensaje);
        
         //Alumno2
        saludo = SaludarAlumno("Luis");
        promedio = CalcularPromedio(20,18,12);
        mensaje = MensajeFinal(promedio);
        System.out.println(saludo);
        System.out.println(mensaje);
        
        
    }
    
    static String SaludarAlumno(String nombreAlumno){
        String mensaje = "Hola" + nombreAlumno;
        return mensaje;
    }
    
    static double CalcularPromedio (double n1, double n2, double n3){
        double promedio = (n1 + n2 +n3)/3;    
        return promedio;
    }
    
    static String MensajeFinal (double promedio){
        String mensaje;
        if (promedio > 15) 
            mensaje = "Felicitaciones";
        else 
            mensaje = "Debes estudiar!!";
          
         return mensaje;       
                }
 
}
