
package Servicio;

import Entidad.ej5_Espectador;
import java.util.ArrayList;
import java.util.Scanner;

public class ej5_EspectadorServicio {
    ArrayList<ej5_Espectador> especList = new ArrayList<ej5_Espectador>();
    Scanner leer = new Scanner (System.in);
 public ArrayList crearEspectadores(){
     
        String resp = "" ;
     ej5_Espectador esp = new ej5_Espectador();
     System.out.println("----- Creacion de espectadores -----");
     
     do{
     System.out.println("Ingrese el nombre del espectador");
     esp.setNombre(leer.next());
     System.out.println("Ingrese la edad");
     esp.setEdad(leer.nextInt());
     System.out.println("Ingrese e ldinero disponible");
     esp.setDineroDisp(leer.nextInt());
     
     especList.add(new ej5_Espectador(esp.getNombre(), esp.getEdad(), esp.getDineroDisp()));
     
          System.out.println("Quiere cargar mas Espectadores? s/n");
           resp= leer.next();
       }while(resp.equalsIgnoreCase("s"));
     
     return especList;
     
 }
    
    
}
