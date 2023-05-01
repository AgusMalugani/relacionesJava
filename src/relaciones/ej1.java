/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import Entidad.ej1_Perro;
import Servicio.ej1_PerroServicio;
import Servicio.ej1_PersonaServicio;
import java.util.ArrayList;

/**
 * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro
 * programa va a tener que contar con muchas personas y muchos perros. El
 * programa deberá preguntarle a cada persona, que perro según su nombre, quiere
 * adoptar. Dos personas no pueden adoptar al mismo perro, si la persona eligió
 * un perro que ya estaba adoptado, se le debe informar a la persona. Una vez
 * que la Persona elige el Perro se le asigna, al final deberemos mostrar todas
 * las personas con sus respectivos perros.
 */
public class ej1 {

    public static void main(String[] args) {
        
        ej1_PerroServicio ps = new ej1_PerroServicio();
        ej1_PersonaServicio persServ = new ej1_PersonaServicio();
        
        ArrayList perroList = ps.crearPerro();
        ArrayList persList = persServ.crearPersona();
        
        persServ.elegirPerro(persList, perroList);
        
    }
    
}
