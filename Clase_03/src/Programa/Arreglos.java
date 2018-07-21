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
public class Arreglos {
    public static void main(String[] args) {
        //DEFINIR ARREGLOS DOS LINEAS
        String[] apellidos;
        apellidos = new String[5];
        
        //DEFINIR ARREGLO EN UNA LINEA
        String [] nombres = new String [5];
        
        //Asignar vaores a los arreglos
        apellidos[0] = "Cordova";//Agregando un valor al indice 0
        apellidos[1] = "Ramirez";
        apellidos[2] = "Leon";
        apellidos[3] = "Perez";
        apellidos[4] = "Sanchez";
        //apellidos[5] = "Paucar";
        
        
        //Definir arreglos con valores por defecto
        String[] departamentos = {"Lima","Piura","Tacna","Puno","Cuzco"};
        
        System.out.println("Tamaño del arreglo departamentos"+ departamentos.length);
        System.out.println("tamaño del arrelgo apellidos" + apellidos.length);
        System.out.println("tamaño dle areglo nombres" + nombres.length);
        
        departamentos[0] = "Arequipa"; //modifcando LIMA x AREQUIPA
        //obtener le vlaor de un indice
        System.out.println("Valor departamento indice 1 =" + departamentos[1]);

        //recorrer arreglos vlaor por valor
        
        
        
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println("el valor en la posicion" + i + "=>"+ departamentos[i]);
        
        }
         // de 5 notas , cual es la nota mayor
         double[] notas = {1,4,12,10,9};
         
         double notaMayor = 0;
         for (int i = 0; i < notas.length; i++) {
             if (notas[i+1]> notaMayor ) {
                 notaMayor=notas[i];
                 
             }
             System.out.println("El numero mayoes es" + notaMayor);
        }
        
          
            
        }
    }

