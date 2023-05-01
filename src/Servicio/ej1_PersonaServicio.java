package Servicio;

import Entidad.ej1_Perro;
import Entidad.ej1_Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ej1_PersonaServicio {

    ArrayList<ej1_Persona> personaList = new ArrayList<ej1_Persona>();
    Scanner leer = new Scanner(System.in);

    public ArrayList crearPersona() {
        String resp = "";

        Scanner leer = new Scanner(System.in);

        System.out.println("----------------CRAER PERSONA----------------");
        do {

            ej1_Persona pers = new ej1_Persona();
            System.out.println("Ingrese los datos de la persona");
            System.out.println("Ingrese Nombre");
            pers.setNombre(leer.next());
            System.out.println("Ingrese Apellido");
            pers.setApellido(leer.next());
            System.out.println("Ingrese edad");
            pers.setEdad(leer.nextInt());
            System.out.println("Ingrese DNI (sin puntos)");
            pers.setDni(leer.nextInt());

            ej1_Persona p = new ej1_Persona(pers.getNombre(), pers.getApellido(), pers.getEdad(), pers.getDni());

            personaList.add(p);

            System.out.println("Quiere cargar mas personas? s/n");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("s"));

        return personaList;
    }

    public void elegirPerro(ArrayList personaList, ArrayList perroList) {
        // ahora debo recorrer a cada persona y mostrarle la lista de perros disponibles y adoptar uno

        System.out.println("Los perros disponibles son: " + perroList.size());
        int i = 0; // para indicarle la posicion del perro.
        for (Object aux : perroList) {

            System.out.println("n° " + i + " " + aux);   // muestra a todos en el mismo momento

            i++;
        }

        Iterator<ej1_Persona> it = personaList.iterator(); // creo un it para recorrer a cada persona
        Iterator<ej1_Perro> itPerro = perroList.iterator(); // idem
        
        while (it.hasNext()) {
            ej1_Persona aux = it.next();  // creamos el it para recorrer las personas y poder asignarles un perro.
            System.out.println(aux.getNombre() + " ingrese el numero del perro que quiere adoptar.");
            int eleccion = leer.nextInt(); // elige al perro que quiere adoptar para despues asignarle como atributo y
                                            // sacarlo de la lista de perros.

            aux.setPerro((ej1_Perro) perroList.get(eleccion)); // le asignamos el perro a la persona
            
            System.out.println("Felicidades " + aux.getNombre() + " acaba de adoptar a: " + aux.getPerro());

            perroList.remove(eleccion);   // para sacar al perro de la lista de adopcion. 
            System.out.println(" ");
            
            System.out.println("Los perros disponibles son: " + perroList.size());  // mostramos los perros que faltan.
            i = 0; // para indicarle la posicion del perro.
            for (Object aux2 : perroList) {

                System.out.println("n° " + i + " " + aux2);
                i++;

            }

        }
        
        System.out.println(personaList.toString());

    }
}
