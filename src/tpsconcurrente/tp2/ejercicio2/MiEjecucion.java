/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsconcurrente.tp2.ejercicio2;

/**
 *
 * @author Kolia
 */
public class MiEjecucion​​ extends Thread{
    
    public void run(){
        ir();
    
    }
    public void ir(){
    
        hacerMas();
    }
    
    public void hacerMas(){
    
        System.out.println("En la pila");
    }
    
}
