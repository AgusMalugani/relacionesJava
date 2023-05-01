/*

 */
package Entidad;

import java.util.ArrayList;

/**
Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
 */
public class ej2_Juego {  // vinculo las dos clases con juego
    private ArrayList<ej2_Jugador> jugadores;  // muchos jugadores
    private ej2_Revolver rev; // 1 revolver

    public ej2_Juego() {
    }

    public ej2_Juego(ArrayList<ej2_Jugador> jugadores, ej2_Revolver rev) {
        this.jugadores = jugadores;
        this.rev = rev;
    }

    public ArrayList<ej2_Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<ej2_Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ej2_Revolver getRev() {
        return rev;
    }

    public void setRev(ej2_Revolver rev) {
        this.rev = rev;
    }

    @Override
    public String toString() {
        return "ej2_Juego{" + "jugadores=" + jugadores + ", rev=" + rev + '}';
    }

    public void getJugadores(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
