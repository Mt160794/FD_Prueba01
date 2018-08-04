/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import POO.Docente;
import POO.Vehiculo;

public class RefernciaObjetos {
    
    public static void main(String[] args) {
    
        //Como crear un onjeto
    Docente objDocente1 = new Docente();
    objDocente1.setNombre ("Luis");
    objDocente1.setApellido ("Cordova");
    objDocente1.setDni ("45842095");
    
    String nombreDocente = objDocente1.getNombre();
    
    }
    
    Vehiculo objVehiculo =  new Vehiculo();
    objVehiculo.setMarca("Lamborghini");
    objVehiculo.setColor("Plata");
    objVehiculo.setNumeroPuertas(2);
    objVehiculo.setPrecio(500000);
    objVehiculo.Avanzar();
    objVehiculo.Detener();
}
