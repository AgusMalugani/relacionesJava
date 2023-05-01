/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ej5_Cine;
import Entidad.ej5_Espectador;
import Entidad.ej5_Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej5_CineServicio {
    Scanner leer = new Scanner (System.in);

    /*
    primer metodo para crear la sala. 8f x 6 c
    Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
     */
    public String[][] sala() {
        
        
        
        String[][] sala = new String[8][6];

        for (int i = 0; i < 8; i++) { // filas  numeros
            sala[i][0] = i + 1 + "A";
            sala[i][1] = i + 1 + "B";
            sala[i][2] = i + 1 + "C";
            sala[i][3] = i + 1 + "D";
            sala[i][4] = i + 1 + "E";
            sala[i][5] = i + 1 + "F";
        }

      
      /*  for (int i = 7; i >= 0; i--) { // filas  numeros
            for (int j = 0; j < 6; j++) { // columnas letra
                System.out.print(sala[i][j] + " " + " | " + " ");
               
            }
            System.out.println("");
        }
      */          
        //prueba

        return sala;

    }
    
    
    public ej5_Cine entradaCine(ArrayList<ej5_Espectador> especList,  ej5_Pelicula peli ){
        // creamos el filtro para solo meter en la sala a quienes tienen la edad y el dinero suficiente.
        
        ej5_Cine cine = new ej5_Cine(); // creamos el objeto cine para guardar el array de las personas y  la peli.
        cine.setPeli(peli);
        System.out.println("Ingrese el costo de la entrada");
        cine.setPrecioEntrada(leer.nextInt());
        
        
        ArrayList<ej5_Espectador> especPeli = new ArrayList<ej5_Espectador>(); // creamos un array para guardar los que complan las condiciones
        
        Iterator <ej5_Espectador> it = especList.iterator(); 
        while(it.hasNext()){
            ej5_Espectador aux = it.next();
            
            if(aux.getDineroDisp() >= cine.getPrecioEntrada()){
                if(aux.getEdad()>= peli.getEdadMin()){
                    // cumple ambas condiciones, entonces lo agrego al array
                    especPeli.add(aux);
                }
            }
            
        }
        cine.setEspectadorList(especPeli);  // ya le cargue los espectadores que tienen la plata y la edad suficiente.
        // genero un filtro para sacar las personas que no podian entrar.
        
        return cine;
        
        
    }
    
    
    public void salaOcupada(String[][] sala){
        
                System.out.println("POSICION");
       int posRand = leer.nextInt();
       

        System.out.println("muestra sala");
         int cont = 0;
        for (int i = 7; i >= 0; i--) { // filas  numeros
            for (int j = 0; j < 6; j++) { // columnas letra
                
                cont++; // con el cont le puedo definir una posicion
               if(cont == posRand){
                   sala[i][j] = "X";
               } 
                System.out.print(sala[i][j] + " " + " | " + " " );
           
                 
                
            }
            System.out.println("");
        }   
    }
    

}
