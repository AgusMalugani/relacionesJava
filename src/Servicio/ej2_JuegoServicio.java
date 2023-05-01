/*
 */
package Servicio;

import Entidad.ej2_Juego;
import Entidad.ej2_Jugador;
import Entidad.ej2_Revolver;
import java.util.ArrayList;
import java.util.Iterator;

/**

 */
public class ej2_JuegoServicio {
    /*
    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
    */
    public ej2_Juego llenarJuego(ArrayList<ej2_Jugador> jugadores, ej2_Revolver r){
        ej2_Juego juego = new ej2_Juego();
        juego.setJugadores(jugadores);  // guardo los jugadores traidos del main
        juego.setRev(r); // guardo el revolver traido del main.
        return juego;
        
    }
    /*
    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    
    */
public void ronda(ej2_Juego juego){
    ej2_JugadorServicio js = new ej2_JugadorServicio();
    
    Iterator<ej2_Jugador> it = juego.getJugadores().iterator(); // creo un iterator para recorrer cada jugador y camBIARLE  el atributo
    
    System.out.println("------------ Ruleta rusa --------------");
    System.out.println("Cantidad de jugadores: " + juego.getJugadores().size());
    
    int cont = 0;
    String resp = " ";
    do{ 
        System.out.println(" ");
      ej2_Jugador aux =  it.next();
      
     // js.Disparo(juego.getRev());
     if(js.Disparo (juego.getRev()) == true){
         aux.setMojado(true);  // le cambiamos el atributo al jugador.
         System.out.println("EL JUGADOR " + aux.getNombre() + " se disparo ");
         cont++;
        resp = aux.getNombre();
         
         
      break;
    } else {
         System.out.println("EL JUGADOR " + aux.getNombre() + " se salvo, es el turno del proximo jugador.");
         cont++;
     }
    }
     while(it.hasNext());
            
     
        System.out.println(" La cantidad de rondas jugadas son: " + cont + " El jugador mojado es: " + resp);
}
}
    ///////////
    
   /* for (int i = 0; i < juego.getJugadores().size(); i++) {
       juego.getJugadores(i);
     js.Disparo(juego.getRev());
     if(js.Disparo (juego.getRev()) == true){
   */      
        
    
    // disparo me devuelve true o false, hago un for que recorra la listad ejugadores, 
    //y desp creo un if para que si lo que me devuelve disparo es true, el jugador se me moje y si devuelve false, el jugador se salve
        
    


    
 
    
    
    
    
    

