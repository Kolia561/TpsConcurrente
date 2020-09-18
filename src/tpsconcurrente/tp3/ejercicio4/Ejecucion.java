/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsconcurrente.tp3.ejercicio4;



/**
 *
 * @author Kolia
 */
public class Ejecucion {
    
    public static void main(String[] args) {
        Surtidor compartido = new Surtidor();
        Thread[] tg = new Thread[5];
        
        for (int i = 0; i < 5; i++) {
            
            tg[i]= new Thread(new Auto("auto"+i,compartido,(int)(Math.random()*100)));
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            tg[i].start();
            
        }
    }
    
}
