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
public class Metodos {
    public static void main(String[] args) {
        
        //Alumno1
        ProcesarOperacion("Luis",12,15,13);
        
         //Alumno1
        ProcesarOperacion("Ana",13,14,10);
        
    }
    //static void SaludarAlumno(String nombreAlumno){
    //    System.out.println("Hola "+ nombreAlumno);}
    
    /* static void CalcularPromedio(double n1, double n2, double n3){
        double promedio = (n1 +n2 +n3)/3;
        if ( promedio >15) {
            System.out.println(" Felicitaciones");
        }
        else
            System.out.println(" Debes estudiar");
    } */
    
    static void ProcesarOperacion(String nombre, double n1, double n2, double n3){
       
        SaludarAlumno(nombre);
        CalcularPromedio( n1, n2, n3);
              
    }
    
    static void SaludarAlumno(String nombreAlumno){
        System.out.println("Hola "+ nombreAlumno);
    }
    static void CalcularPromedio(double n1, double n2, double n3){
        double promedio = (n1 +n2 +n3)/3;
        if ( promedio >15) {
            System.out.println(" Felicitaciones");
        }
        else
            System.out.println(" Debes estudiar");
    }
}
