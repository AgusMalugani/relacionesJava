/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
public class ej5_Cine {
    private ej5_Pelicula peli;  // vinculo, 1 peli por objeto
    private ArrayList<ej5_Espectador> espectadorList; // y varios espectadores por pelicula
    private int precioEntrada;

    public ej5_Cine() {
    }

    public ej5_Cine(ej5_Pelicula peli, ArrayList<ej5_Espectador> espectadorList, int precioEntrada) {
        this.peli = peli;
        this.espectadorList = espectadorList;
        this.precioEntrada = precioEntrada;
    }

    public ej5_Pelicula getPeli() {
        return peli;
    }

    public void setPeli(ej5_Pelicula peli) {
        this.peli = peli;
    }

    public ArrayList<ej5_Espectador> getEspectadorList() {
        return espectadorList;
    }

    public void setEspectadorList(ArrayList<ej5_Espectador> espectadorList) {
        this.espectadorList = espectadorList;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "ej5_Cine{" + "peli=" + peli + ", espectadorList=" + espectadorList + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
    
    
    
}
