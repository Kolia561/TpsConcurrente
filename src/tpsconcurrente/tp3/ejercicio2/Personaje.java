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
public class Personaje implements Runnable{
    
    private int pc;
    private Vida objetivo;
    
    public Personaje(int valor, Vida targ){
    this.pc = valor;
    this.objetivo = targ;
    }
    
    public void run(){
        
        do {            
            objetivo.modificarVida(pc);
            System.out.println("La vida es igual a :"+ objetivo.getVida());
        } while (objetivo.getVida()>0);
        
       
        
    }
    
}
