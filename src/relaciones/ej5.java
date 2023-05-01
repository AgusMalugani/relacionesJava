/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
 */
package relaciones;

import Entidad.ej5_Cine;
import Entidad.ej5_Espectador;
import Entidad.ej5_Pelicula;
import Servicio.ej5_CineServicio;
import Servicio.ej5_EspectadorServicio;
import Servicio.ej5_PeliculaServicio;
import java.util.ArrayList;

public class ej5 {

    public static void main(String[] args) {
      // tenemos que importar la pelicula y la lista de los espectadores, asi podemos mandarle por parametro al cine
      ej5_PeliculaServicio ps = new ej5_PeliculaServicio();
     ej5_Pelicula peli = ps.crearPelicula(); // guardamos la pelicula creada en el objeto peli.
      
      ej5_EspectadorServicio es = new ej5_EspectadorServicio();
     ArrayList<ej5_Espectador> especList = es.crearEspectadores(); // guardamos la lista de espectadores en especList
      

   ej5_CineServicio cs = new ej5_CineServicio();
   ej5_Cine cine = cs.entradaCine(especList, peli);
 
  String [][] sala = cs.sala();
  
  // una vez cargados los datos del cine, con su peli, y personas. y creada la sala
  // debemos hacer que cada persona ocupe un lugar de la sala.
  
     cs.salaOcupada(sala);
      
      
      
      
    }
    
}
