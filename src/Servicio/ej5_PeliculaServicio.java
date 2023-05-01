
package Servicio;

import Entidad.ej5_Pelicula;
import java.util.Scanner;

public class ej5_PeliculaServicio {
    Scanner leer = new Scanner(System.in);
    
    public ej5_Pelicula crearPelicula(){
        ej5_Pelicula peli = new ej5_Pelicula();
        System.out.println("-----Creacion de pelicula-----");
        System.out.println("Ingrese el titulo de la pelicula");
      peli.setTitulo(leer.next());
        System.out.println("Ingrese la duracion de la pelicula en minutos.");
        peli.setDuracion(leer.nextInt());
        System.out.println("Ingrese la edad minima para poder ver la pelicula");
        peli.setEdadMin(leer.nextInt());
        System.out.println("Ingrese el nombre del director");
        peli.setDirector(leer.next());
        return peli;
    }
    
}
