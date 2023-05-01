/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import Entidad.ej2_Juego;
import Entidad.ej2_Jugador;
import Entidad.ej2_Revolver;
import Servicio.ej2_JuegoServicio;
import Servicio.ej2_JugadorServicio;
import Servicio.ej2_RevolverServicio;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ej2_RevolverServicio rs = new ej2_RevolverServicio();
        ej2_Revolver re = rs.llenarRevolver();

        System.out.println(" ");

        ej2_JugadorServicio js = new ej2_JugadorServicio();
         ArrayList<ej2_Jugador> jugadores = js.crearJugadores();
         //js.Disparo(re);

       System.out.println(" ");
       
       ej2_JuegoServicio juegoServ = new ej2_JuegoServicio();
       
      ej2_Juego juego = juegoServ.llenarJuego(jugadores, re);
         juegoServ.ronda(juego);
         
         
    }

}
