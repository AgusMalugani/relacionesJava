
package Servicio;

import Entidad.ej2_Revolver;

/*
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
public class ej2_RevolverServicio {
  
    
    public ej2_Revolver llenarRevolver(){
        
          ej2_Revolver r = new ej2_Revolver();
          
        r.setPosicionActual((int) (Math.random() * 6 +1));
        r.setPosicionAgua((int) (Math.random() * 6+1));

        return r;
    }
    public boolean mojar(ej2_Revolver r){
        
        boolean bandera = false ;
        if(r.getPosicionActual() == r.getPosicionAgua()){
            bandera = true;
        }
        System.out.println(bandera);
        return bandera;
        
    }
    public void siguienteChorro(ej2_Revolver r ){
        if ( r.getPosicionActual()== 6 ){
            r.setPosicionActual(1);
        } else {
             r.setPosicionActual(r.getPosicionActual()+1);
        }
       
    }
   
    
}
