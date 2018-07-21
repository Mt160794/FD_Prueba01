/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Administrador
 */
public class ejericico {
    
    public static void main(String[] args) {
        
         String[] alumnos = {"Martin","Alberto","Franco","Nancy","Aldo","Luz"};
         double[] notas = {11,10,9,18,10,13};  
        
         for (int i = 0; i < notas.length; i++) {
             if (notas[i]<= 10) {
                 System.out.println(alumnos[i] + "tiene"+" "+ notas[i]);
                 System.out.println("Necesita apoyo");
              }
             else if (notas[i]>10 & notas[i]<= 15) {
                 System.out.println(alumnos[i] + "tiene"+" "+ notas[i]);
                 System.out.println("Mejorando");
             }
             else if(notas[i]>15){
             System.out.println(alumnos[i] + "tiene"+" "+ notas[i]);
             System.out.println("Muy bien");
         }
        }
        
        
    
    }
    
}
