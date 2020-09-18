/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsconcurrente.tp3.ejercicio2;

/**
 *
 * @author Kolia
 */
public class Vida {
    
    private int puntos = 10;
    
    
    
    public synchronized int getVida(){
    return puntos;
    }
    
    public synchronized void modificarVida(int a){
    
       this.puntos = puntos + a; 
       System.out.println(Thread.currentThread().getName()+
               ": modifico en " + a + " la vida. Vida igual a "+ puntos);
        
    }
    
    
}
