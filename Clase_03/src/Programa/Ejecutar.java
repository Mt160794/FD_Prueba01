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
public class Ejecutar {
  static double radio_circulo = 6.75;
  static final double valor_pi= 3.1415;
  
    public static void main(String[] args) {
        System.out.println("El valor d ela variable es" + radio_circulo);
        System.out.println("El valor de la constante es" + valor_pi);
        //Cambiando valores
        radio_circulo = 1.4;
        //valor_pi = 0; no se puede porque es static FINAL
        System.out.println("el nueov valor de la variable es" + radio_circulo);
    }
  
          
// Mi primer comentario para GITHUB
}
