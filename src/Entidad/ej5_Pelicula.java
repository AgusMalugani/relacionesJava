/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
de las películas nos interesa saber
el título, duración, edad mínima y director
 */
public class ej5_Pelicula {
  private String titulo;
private int duracion;
private int edadMin;
private String director;

    public ej5_Pelicula() {
    }

    public ej5_Pelicula(String titulo, int duracion, int edadMin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "ej5_Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMin=" + edadMin + ", director=" + director + '}';
    }





}
