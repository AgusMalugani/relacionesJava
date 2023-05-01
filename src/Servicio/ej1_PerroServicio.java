package Servicio;

import Entidad.ej1_Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class ej1_PerroServicio {
ArrayList<ej1_Perro> perroList = new ArrayList<ej1_Perro>();

    public ArrayList crearPerro() {

        Scanner leer = new Scanner(System.in);
        String resp = "" ;
  System.out.println("----------------CRAER PERRO----------------");
  ej1_Perro perro = new ej1_Perro();
       do{ 
        
        System.out.println("Ingrese los datos del perro");
        System.out.println("Ingrese Nombre");
        perro.setNombre(leer.next());
        System.out.println("Ingrese raza");
        perro.setRaza(leer.next());
        System.out.println("Ingrese edad");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese tamanio: pequenio mediano grande");
        perro.setTamaño(leer.next());
        
        ej1_Perro p = new ej1_Perro(perro.getNombre(), perro.getRaza(), perro.getEdad(), perro.getTamaño());
        
        perroList.add(p);
        
           System.out.println("Quiere cargar mas perros? s/n");
           resp= leer.next();
       }while(resp.equalsIgnoreCase("s"));
       

        return perroList;
    }

}
