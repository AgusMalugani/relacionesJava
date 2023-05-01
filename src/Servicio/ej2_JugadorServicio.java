/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ej2_Jugador;
import Entidad.ej2_Revolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * atributos: id (representa el número del jugador), nombre (Empezara con
 * Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si está mojado o
 * no el jugador). El número de jugadores será decidido por el usuario, pero
 * debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 *
 * Métodos: • disparo(Revolver r): el método, recibe el revolver de agua y llama
 * a los métodos de mojar() y siguienteChorro() de Revolver. El jugador se
 * apunta, aprieta el gatillo y si el revolver tira el agua, el jugador devuelve
 * true, sino false.
 */
public class ej2_JugadorServicio {

    ArrayList<ej2_Jugador> jugadoresList = new ArrayList<ej2_Jugador>();

    ej2_RevolverServicio rs = new ej2_RevolverServicio();

    public ArrayList crearJugadores() {

        ej2_Jugador j1 = new ej2_Jugador(1, "agustin", false);
        ej2_Jugador j2 = new ej2_Jugador(2, "juan", false);
        ej2_Jugador j3 = new ej2_Jugador(3, "jose", false);
        ej2_Jugador j4 = new ej2_Jugador(4, "maria", false);
        ej2_Jugador j5 = new ej2_Jugador(5, "laura", false);
        ej2_Jugador j6 = new ej2_Jugador(6, "melani", false);
        jugadoresList.add(j1);
        jugadoresList.add(j2);
        jugadoresList.add(j3);
        jugadoresList.add(j4);
        jugadoresList.add(j5);
        jugadoresList.add(j6);
        return jugadoresList; 
// retornamos el array con los jugadores
    }

    public boolean Disparo(ej2_Revolver r) { // creamos el metodo, mandandole por parametro el revolver con los datos del main.
        boolean mojado = false;
      //  for (ej2_Jugador aux : jugadoresList) { // recorremos el array
        //    System.out.println(" Es el turno de: " + aux.getNombre());
            
            System.out.println(r.getPosicionAgua() + " " + r.getPosicionActual()); // para saber en que posicion nos encontramos
            if (rs.mojar(r) == false) {
              //  System.out.println(" El jugador se salvo!! pasaremos al siguiente.... ");
                rs.siguienteChorro(r);

            } else {
            //System.out.println(" El jugador se ha mojado!!!! ");
                // ahora debemos cambiar el atributo mojado de ese jugador
            //    aux.setMojado(true);
                mojado = true;
                
              //  break;
            }
            return mojado;
        }
           // return mojado;
    }

    /* 
     public void disparo(){
         jugadoresList.add(j1);
            jugadoresList.add(j2);
               jugadoresList.add(j3);
               
                 ej2_RevolverServicio rs = new ej2_RevolverServicio();
                 
               Iterator<ej2_Jugador> it = jugadoresList.iterator();
               System.out.println("Tenemos un total de " + jugadoresList.size() + " jugadores");
               while(it.hasNext()){ 
                   ej2_Jugador aux = it.next(); // guardo cada jugador
                   
            System.out.println("Es turno del jugador" + aux);
            
            
            
               // si la posicion es igual tira true y se moja.  
               boolean mojado = rs.mojar();
                   rs.siguienteChorro();
                   System.out.println(mojado);
                   for (ej2_Jugador jugador : jugadoresList) {
                       
                   }
                   
               } 
     */

