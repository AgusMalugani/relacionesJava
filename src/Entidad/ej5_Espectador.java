/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 */
public class ej5_Espectador {
    private String nombre;
    private int edad;
    private int dineroDisp;

    public ej5_Espectador() {
    }

    public ej5_Espectador(String nombre, int edad, int dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(int dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    @Override
    public String toString() {
        return "ej5_Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisp=" + dineroDisp + '}';
    }
    
    
    
    
    
}
